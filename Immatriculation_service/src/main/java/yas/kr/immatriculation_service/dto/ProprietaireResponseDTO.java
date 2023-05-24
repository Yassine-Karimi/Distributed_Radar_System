package yas.kr.immatriculation_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import yas.kr.immatriculation_service.entities.Vehicule;

import jakarta.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProprietaireResponseDTO {
    @Id
    private String id;
    private String nom;
    private Long dateNaissance;
    private String email;
    private List<Vehicule> vehicules;
}
