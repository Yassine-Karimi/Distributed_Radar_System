package yas.kr.infractionsservice.web;
import org.springframework.web.bind.annotation.*;
import yas.kr.infractionsservice.entities.Infraction;
import yas.kr.infractionsservice.repositories.InfractionRepository;

import java.util.List;

@RestController
@RequestMapping("/web")
public class InfractionRestController {

    private final InfractionRepository infractionRepository;

    public InfractionRestController(InfractionRepository infractionRepository) {
        this.infractionRepository = infractionRepository;
    }

    // Simple CRUD operations
    // - Read all infractions
    @GetMapping("/infractions")
    public List<Infraction> getInfractions(){
        return infractionRepository.findAll();
    }

    // - Read by id
    @GetMapping("/infractions/{id}")
    public Infraction getInfractionById(@PathVariable("id") Long id){
        return infractionRepository.findById(id).get();
    }

    // - Save infraction
    @PostMapping("/infractions")
    public Infraction saveInfraction(@RequestBody Infraction infraction){
        return infractionRepository.save(infraction);
    }

    // - Update infraction
    @PutMapping("/infractions/{id}")
    public Infraction updateInfraction(@PathVariable("id") Long id,@RequestBody Infraction infraction){
        if(infractionRepository.existsById(id)){
            Infraction savedInfraction = infractionRepository.findById(id).get();

            if(infraction.getDate() != null) savedInfraction.setDate(infraction.getDate());
            if(infraction.getVehicleSpeed() != null) savedInfraction.setVehicleSpeed(infraction.getVehicleSpeed());
            if(infraction.getRadarMaxSpeed() != null) savedInfraction.setRadarMaxSpeed(infraction.getRadarMaxSpeed());
            if(infraction.getFineAmount() != null) savedInfraction.setFineAmount(infraction.getFineAmount());
            if(infraction.getRadarId() != null) savedInfraction.setRadarId(infraction.getRadarId());
            if(infraction.getVehicleId() != null) savedInfraction.setVehicleId(infraction.getVehicleId());

            return infractionRepository.save(savedInfraction);
        }
        return null;
    }

    // - Delete infraction
    @DeleteMapping("/infractions/{id}")
    public boolean deleteInfraction(@PathVariable("id") Long id){
        if(infractionRepository.existsById(id)){
            infractionRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // Custom operations
    // - Read by radar id
    @GetMapping("/infractions/radar/{id}")
    public List<Infraction> getInfractionsByRadarId(@PathVariable("id") Long id){
        return infractionRepository.findByRadarId(id);
    }
}