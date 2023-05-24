package yas.kr.immatriculation_service.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import yas.kr.immatriculation_service.entities.Proprietaire;
import yas.kr.immatriculation_service.entities.Vehicule;
import yas.kr.immatriculation_service.repository.ProprietaireRepository;
import yas.kr.immatriculation_service.repository.VehiculeRepository;

import java.util.List;
import java.util.Optional;

@Controller
public class ImmatriculationGraphQLController {

    @Autowired
    private ProprietaireRepository proprietaireRepository;

    private VehiculeRepository vehiculeRepository;



    @QueryMapping
    public List<Proprietaire> proprietaires() {
        return proprietaireRepository.findAll();
    }
    @QueryMapping
    public List<Vehicule> vehicules() {
        return vehiculeRepository.findAll();
    }

    @QueryMapping
    public Optional<Proprietaire> proprietaire(@Argument Long id) {
        return proprietaireRepository.findById(id);
    }

    @QueryMapping
    public Optional<Vehicule> vehicule(@Argument Long id) {
        return vehiculeRepository.findById(id);
    }

    @MutationMapping
    public Proprietaire createProprietaire(String nom, String dateNaissance, String email,String adresse) {
        // Implémentez la logique pour créer un propriétaire
        Proprietaire proprietaire= Proprietaire.builder()
                .nom(nom)
                .dateNaissance(dateNaissance)
                .email(email)
                .adresse(adresse)
                .build();
        return proprietaireRepository.save(proprietaire);
    }
/*
    public Vehicule createVehicule(String numeroMatricule, String marque, int puissanceFiscale, String modele) {
        // Implémentez la logique pour créer un véhicule
        return immatriculationService.createVehicule(numeroMatricule, marque, puissanceFiscale, modele);
    }

*/
}
