package yas.kr.immatriculation_service.grpc;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import yas.kr.immatriculation_service.entities.Proprietaire;
import yas.kr.immatriculation_service.entities.Vehicule;
import yas.kr.immatriculation_service.grpc.stub.ImmatriculationServiceGrpc;
import yas.kr.immatriculation_service.grpc.stub.Imt;
import yas.kr.immatriculation_service.mappers.ProprietaireMapper;
import yas.kr.immatriculation_service.mappers.VehiculeMapper;
import yas.kr.immatriculation_service.repository.ProprietaireRepository;
import yas.kr.immatriculation_service.repository.VehiculeRepository;

import java.util.List;
import java.util.stream.Collectors;


@GrpcService
@Slf4j
@AllArgsConstructor
public class ImmatriculationService extends ImmatriculationServiceGrpc.ImmatriculationServiceImplBase {


    private ProprietaireRepository proprietaireRepository;
    private VehiculeRepository vehiculeRepository;
    private ProprietaireMapper proprietaireMapper;
    private VehiculeMapper vehiculeMapper;

    @Override
    public void createProprietaire(Imt.CreateProprietaireRequest request, StreamObserver<Imt.CreateProprietaireResponse> responseObserver) {
       Proprietaire proprietaire = new Proprietaire();
       proprietaire.setAdresse("Adresse de "+request.getNom());
       proprietaire.setEmail(request.getEmail());
       proprietaire.setNom(request.getNom());
       proprietaire.setVehicules(null);
       proprietaire.setDateNaissance(request.getDateNaissance());
       Proprietaire savedOwner = proprietaireRepository.save(proprietaire);
       Imt.Proprietaire grpcOwner = proprietaireMapper.fromOwner(savedOwner);
       Imt.CreateProprietaireResponse response = Imt.CreateProprietaireResponse.newBuilder()
               .setProprietaire(grpcOwner)
               .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();


    }

    @Override
    public void createVehicule(Imt.CreateVehiculeRequest request, StreamObserver<Imt.CreateVehiculeResponse> responseObserver) {
        // Logique pour créer un véhicule
        // ...

        // Création de la réponse
        /*
        String marque = request.getMarque();
        Imt.Vehicule vehicule = Imt.Vehicule.newBuilder()
                .setMarque(request.getMarque())
                .setModele(request.getModele())
                .setNumeroMatricule(request.getNumeroMatricule())
                .setPuissanceFiscale(request.getPuissanceFiscale())
                .build();
        Imt.CreateVehiculeResponse response = Imt.CreateVehiculeResponse.newBuilder()
                .setVehicule(vehicule)
                .build();

        // Envoi de la réponse au client
        responseObserver.onNext(response);
        responseObserver.onCompleted();

         */


        Vehicule vehicule = new Vehicule();
        vehicule.setMatricule(request.getNumeroMatricule());
        vehicule.setModele(request.getModele());
        vehicule.setMarque(request.getMarque());
        vehicule.setPuissanceFiscale(request.getPuissanceFiscale());

        vehicule.setProprietaire(null);

        Vehicule savedv = vehiculeRepository.save(vehicule);
        Imt.Vehicule grpcV = vehiculeMapper.fromVehicule(savedv);
        Imt.CreateVehiculeResponse response = Imt.CreateVehiculeResponse.newBuilder()
                .setVehicule(grpcV)
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }

    // Autres méthodes redéfinies pour les opérations de modification
    @Override
    public void getProprietaire(Imt.GetProprietaireRequest request, StreamObserver<Imt.GetProprietaireResponse> responseObserver) {
        Proprietaire proprietaire = proprietaireRepository.findById(request.getId()).get();
        Imt.Proprietaire grpcOwner = proprietaireMapper.fromOwner(proprietaire);
        Imt.GetProprietaireResponse proprietaireResponse=Imt.GetProprietaireResponse.newBuilder()
                .setProprietaire(grpcOwner)
                .build();
        responseObserver.onNext(proprietaireResponse);
        responseObserver.onCompleted();
    }


    @Override
    public void listProprietaires(Imt.GetAllProprietairesRequest request,StreamObserver<Imt.GetAllProprietairesResponse> responseObserver) {
        List<Proprietaire> proprietaireList = proprietaireRepository.findAll();
        Imt.GetAllProprietairesResponse.Builder ownersBuilder = Imt.GetAllProprietairesResponse.newBuilder();
        List<Imt.Proprietaire> owners = proprietaireList.stream().map(proprietaireMapper::fromOwner).collect(Collectors.toList());
        ownersBuilder.addAllProprietaire(owners);
        responseObserver.onNext(ownersBuilder.build());
        responseObserver.onCompleted();
    }
    @Override
    public void listVehicules(Imt.GetAllVehiculesRequest request,StreamObserver<Imt.GetAllVehiculesResponse> responseObserver) {
        List<Vehicule> vehiculeList = vehiculeRepository.findAll();
        Imt.GetAllVehiculesResponse.Builder vBuilder = Imt.GetAllVehiculesResponse.newBuilder();
        List<Imt.Vehicule> vehicules= vehiculeList.stream().map(vehiculeMapper::fromVehicule).collect(Collectors.toList());
        vBuilder.addAllVehicule(vehicules);
        responseObserver.onNext(vBuilder.build());
        responseObserver.onCompleted();
    }






}
