package yas.kr.radarservice.web.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import yas.kr.radarservice.entities.Radar;
import yas.kr.radarservice.feign.ImmatriculationRestClient;
import yas.kr.radarservice.feign.InfractionRestClient;
import yas.kr.radarservice.model.Infraction;
import yas.kr.radarservice.model.Vehicule;
import yas.kr.radarservice.repositories.RadarRepository;
import yas.kr.radarservice.web.grpc.stubs.RadarOut;
import yas.kr.radarservice.web.grpc.stubs.RadarServiceGrpc;

import java.util.Date;

@GrpcService
public class RadarService extends RadarServiceGrpc.RadarServiceImplBase {

    private final RadarRepository radarRepository;
    private final InfractionRestClient infractionRestClient;
    private final ImmatriculationRestClient immatriculationRestClient;

    public RadarService(RadarRepository radarRepository, InfractionRestClient infractionRestClient, ImmatriculationRestClient immatriculationRestClient) {
        this.radarRepository = radarRepository;
        this.infractionRestClient = infractionRestClient;
        this.immatriculationRestClient = immatriculationRestClient;
    }

    @Override
    public void detectInfraction(RadarOut.DetectRequest request, StreamObserver<RadarOut.Infraction> responseObserver) {
        Long radarId = request.getRadarId();
        Long vehicleId = request.getVehiculeId();
        Double vehicleSpeed = request.getSpeed();
        if(radarRepository.existsById(radarId) && immatriculationRestClient.isVehiculeExistsById(vehicleId)){
            System.out.println("radar et vehicule sont exist");
            Radar radar = radarRepository.findById(radarId).get();
            Vehicule vehicle = immatriculationRestClient.getVehicule(vehicleId);
            if (vehicleSpeed > radar.getMaxSpeed()){
                Infraction infraction = Infraction.builder()
                        .date(new Date().toString())
                        .vehiculeSpeed(vehicleSpeed)
                        .radarMaxSpeed(radar.getMaxSpeed())
                        .fineAmount((vehicleSpeed - radar.getMaxSpeed()) * 100)
                        .radarId(radar.getId())
                        .vehiculeId(vehicle.getId())
                        .vehicule(vehicle)
                        .radar(radar)
                        .build();
                infraction = infractionRestClient.saveInfraction(infraction);

                infraction.setVehicule(vehicle);
                infraction.setRadar(radar);

                RadarOut.Infraction response = RadarOut.Infraction.newBuilder()
                        .setId(infraction.getId())
                        .setDate(infraction.getDate())
                        .setVehiculeSpeed(vehicleSpeed)
                        .setRadarMaxSpeed(radar.getMaxSpeed())
                        .setFineAmount(infraction.getFineAmount())
                        .setRadarId(infraction.getRadarId())
                        .setVehiculeId(vehicleId)
                        .setVehicule(RadarOut.Vehicule.newBuilder()
                                .setId(infraction.getVehicule().getId())
                                .setBrand(vehicle.getMarque())
                                .setModel(vehicle.getModele())
                                .build())
                        .setRadar(RadarOut.Radar.newBuilder()
                                .setId(infraction.getRadar().getId())
                                .setLongitude(infraction.getRadar().getLongitude())
                                .setLatitude(infraction.getRadar().getLatitude())
                                .setMaxSpeed(infraction.getRadar().getMaxSpeed())
                                .build())
                        .build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        }

    }
}
