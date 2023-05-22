package yas.kr.radarservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import yas.kr.radarservice.model.Proprietaire;
import yas.kr.radarservice.model.Vehicule;
@FeignClient(name = "IMMATRICULATION-SERVICE")
public interface ImmatriculationRestClient {
    // Check if owner exists
    @GetMapping("/web/proprietaires/exist/{id}")
    boolean isProprietaireExistsById(@PathVariable("id") Long id);

    // Get owner
    @GetMapping("/web/proprietaires/{id}")
    Proprietaire getProprietaire(@PathVariable("id") Long id);

    // Check if vehicle exists
    @GetMapping("/web/vehicules/exist/{id}")
    boolean isVehiculeExistsById(@PathVariable("id") Long id);

    // Get vehicle
    @GetMapping("/web/vehicules/{id}")
    Vehicule getVehicule(@PathVariable("id") Long id);
}
