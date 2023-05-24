package yas.kr.immatriculation_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yas.kr.immatriculation_service.entities.Vehicule;

import java.util.Optional;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {

    public Optional<Vehicule> findById(Long id);

}
