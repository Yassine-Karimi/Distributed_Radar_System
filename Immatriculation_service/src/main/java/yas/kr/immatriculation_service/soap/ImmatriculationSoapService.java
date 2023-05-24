package yas.kr.immatriculation_service.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import yas.kr.immatriculation_service.entities.Proprietaire;
import yas.kr.immatriculation_service.entities.Vehicule;
import yas.kr.immatriculation_service.repository.ProprietaireRepository;
import yas.kr.immatriculation_service.repository.VehiculeRepository;


import java.util.List;
@Component
@WebService
@AllArgsConstructor
@NoArgsConstructor
public class ImmatriculationSoapService {
    @Autowired
    private ProprietaireRepository proprietaireRepository;
    @Autowired
    private VehiculeRepository vehiculeRepository;

    @WebMethod
    public List<Proprietaire> proprietaireList(){
        return proprietaireRepository.findAll();
    }

    @WebMethod
    public Proprietaire proprietaireById(@WebParam(name = "id") Long id){
        Proprietaire proprietaire = proprietaireRepository.findById(id).get();
        return proprietaire;
    }

    @WebMethod
    public List<Vehicule> vehiculeList(){
        return vehiculeRepository.findAll();
    }

    @WebMethod
    public Vehicule vehiculeById(@WebParam(name = "id") Long id){
        Vehicule vehicule =vehiculeRepository.findById(id).get();
        return vehicule;
    }

}