package yas.kr.radarservice.web;

import org.springframework.web.bind.annotation.*;
import yas.kr.radarservice.entities.Radar;

import yas.kr.radarservice.feign.ImmatriculationRestClient;
import yas.kr.radarservice.feign.InfractionRestClient;
import yas.kr.radarservice.model.Infraction;
import yas.kr.radarservice.model.Vehicule;
import yas.kr.radarservice.repositories.RadarRepository;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/web")
public class RadarRestController {
    private final RadarRepository radarRepository;
    private final ImmatriculationRestClient immatriculationRestClient;
    private final InfractionRestClient infractionRestClient;

    public RadarRestController(RadarRepository radarRepository, ImmatriculationRestClient immatriculationRestClient, InfractionRestClient infractionRestClient) {
        this.radarRepository = radarRepository;
        this.immatriculationRestClient = immatriculationRestClient;
        this.infractionRestClient = infractionRestClient;
    }

    // Simple CRUD operations
    // - Read all
    @GetMapping("/radars")
    public List<Radar> getRadars(){
        List<Radar> radars = radarRepository.findAll();
        for(Radar radar : radars){

            List<Infraction> infractions = infractionRestClient.getInfractionsByRadarId(radar.getId());
            for(Infraction infraction : infractions){
                Vehicule vehicle = immatriculationRestClient.getVehicule(infraction.getVehiculeId());
                infraction.setVehicule(vehicle);
            }
            radar.setInfractions(infractions);
        }
        return radars;
    }

    // - Read by id
    @GetMapping("/radars/{id}")
    public Radar getRadar(@PathVariable("id") Long id){
        return radarRepository.findById(id).get();
    }

    // - Save radar
    @PostMapping("/radars")
    public Radar saveRadar(@RequestBody Radar radar){
        return radarRepository.save(radar);
    }

    // - Update
    @PutMapping("/radars/{id}")
    public Radar updateRadar(@PathVariable("id") Long id,@RequestBody Radar radar){
        if(radarRepository.existsById(id)){
            Radar savedRadar = radarRepository.findById(id).get();

            if(radar.getMaxSpeed() != null) savedRadar.setMaxSpeed(radar.getMaxSpeed());
            if(radar.getLatitude() != null) savedRadar.setLatitude(radar.getLatitude());
            if(radar.getLongitude() != null) savedRadar.setLongitude(radar.getLongitude());

            return radarRepository.save(savedRadar);
        }
        return null;
    }

    // - Delete
    @DeleteMapping("/radars/{id}")
    public boolean deleteRadar(@PathVariable("id") Long id){
        if(radarRepository.existsById(id)){
            radarRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // Add speed infractions
    @PostMapping("/radars/{id}/vehicles/{vehicleId}")
    public Infraction addSpeedInfraction(@PathVariable("id") Long id, @PathVariable("vehicleId") Long vehicleId, @RequestParam("speed") Double speed){
        if(radarRepository.existsById(id) && immatriculationRestClient.isVehiculeExistsById(vehicleId)){
            Radar radar = radarRepository.findById(id).get();
            Vehicule vehicle = immatriculationRestClient.getVehicule(vehicleId);
            if (speed > radar.getMaxSpeed()){
                Infraction infraction = Infraction.builder()
                        .id(null)
                        .date(new Date().toString())
                        .vehiculeSpeed(speed)
                        .radarMaxSpeed(radar.getMaxSpeed())
                        .fineAmount((speed - radar.getMaxSpeed()) * 100)
                        .radarId(radar.getId())
                        .vehiculeId(vehicle.getId())
                        .vehicule(vehicle)
                        .radar(radar)
                        .build();
                infraction = infractionRestClient.saveInfraction(infraction);
                infraction.setVehicule(vehicle);
                infraction.setRadar(radar);
                return infraction;
            }
        }
        return null;
    }
}