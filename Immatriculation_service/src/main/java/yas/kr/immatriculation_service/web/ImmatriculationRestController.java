package yas.kr.immatriculation_service.web;

import org.springframework.web.bind.annotation.*;
import yas.kr.immatriculation_service.entities.Proprietaire;
import yas.kr.immatriculation_service.entities.Vehicule;
import yas.kr.immatriculation_service.repository.ProprietaireRepository;
import yas.kr.immatriculation_service.repository.VehiculeRepository;

import java.util.List;

@RestController
@RequestMapping("/web")
public class ImmatriculationRestController {


    private ProprietaireRepository proprietaireRepository;
    private VehiculeRepository vehiculeRepository;

    public ImmatriculationRestController(ProprietaireRepository proprietaireRepository,VehiculeRepository vehiculeRepository) {

        this.vehiculeRepository=vehiculeRepository;

        this.proprietaireRepository = proprietaireRepository;
    }

    @GetMapping("/proprietaires")
    public List<Proprietaire> proprietaireList(){
        return proprietaireRepository.findAll();
    }

    @GetMapping("/vehicules")
    public List<Vehicule> vehiculeList(){
        return vehiculeRepository.findAll();
    }

    @GetMapping("/proprietaires/{id}")
    public Proprietaire proprietaire(@PathVariable Long id){
        return proprietaireRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Propritaire  %s not found ",id)));
    }
    @GetMapping("/vehicules/{id}")
    public Vehicule vehicule(@PathVariable Long id){
        return vehiculeRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Vehicule  %s not found ",id)));
    }

    @PostMapping("/proprietaires")
    public Proprietaire createProprietaire(@RequestBody Proprietaire proprietaire) {
        return proprietaireRepository.save(proprietaire);
    }

    @PutMapping("/proprietaires/{id}")
    public  Proprietaire update(@PathVariable Long id,@RequestBody Proprietaire proprietaire){
        Proprietaire p=proprietaireRepository.findById(id).orElseThrow();
        if(proprietaire.getNom()!= null)
            p.setNom(proprietaire.getNom());
        if(proprietaire.getDateNaissance()!= null)
            p.setDateNaissance(proprietaire.getDateNaissance());
        if(proprietaire.getEmail()!= null)
            p.setEmail(proprietaire.getEmail());
        if(proprietaire.getAdresse()!= null)
            p.setAdresse(proprietaire.getAdresse());
        return proprietaireRepository.save(p);
    }
    @DeleteMapping("/proprietaires/{id}")
    public void  deleteProprietaire(@PathVariable Long id){
        proprietaireRepository.deleteById(id);
    }
    // - Check if vehicle exists
    @GetMapping("/vehicules/exist/{id}")
    public boolean vehicleExists(@PathVariable("id") Long id){
        return vehiculeRepository.existsById(id);
    }
}
