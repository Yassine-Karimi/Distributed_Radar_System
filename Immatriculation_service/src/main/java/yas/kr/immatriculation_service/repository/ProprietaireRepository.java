package yas.kr.immatriculation_service.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import yas.kr.immatriculation_service.entities.Proprietaire;

import java.util.Optional;

@RepositoryRestResource
@Repository
public interface ProprietaireRepository extends JpaRepository<Proprietaire,Long> {
    public Optional<Proprietaire> findById(Long id);
}

