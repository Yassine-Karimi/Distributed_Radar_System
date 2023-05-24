package yas.kr.immatriculation_service.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yas.kr.immatriculation_service.entities.Proprietaire;
import yas.kr.immatriculation_service.entities.Vehicule;

import java.util.List;

@RestController
@RequestMapping("/api/soap/owner")
public class ImmatriculationSoapController {
    private ImmatriculationSoapService immatriculationSoapService;

    @Autowired
    public ImmatriculationSoapController(ImmatriculationSoapService immatriculationSoapService) {
        this.immatriculationSoapService = immatriculationSoapService;
    }

    @GetMapping("/proprietaires")
    public List<Proprietaire> getOwners() {
        return immatriculationSoapService.proprietaireList();
    }

    @GetMapping("/proprietaires/{id}")
    public Proprietaire getOwnerById(@PathVariable("id") Long id) {
        return immatriculationSoapService.proprietaireById(id);
    }

    @GetMapping("/vehicules")
    public List<Vehicule> getVehicule() {
        return immatriculationSoapService.vehiculeList();
    }

    @GetMapping("/vehicules/{id}")
    public Vehicule getVehiculeById(@PathVariable("id") Long id) {
        return immatriculationSoapService.vehiculeById(id);
    }
}
