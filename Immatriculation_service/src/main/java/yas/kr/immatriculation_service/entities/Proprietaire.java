package yas.kr.immatriculation_service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class Proprietaire {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String dateNaissance;
    private String email;
    private String adresse;
    @OneToMany(mappedBy = "proprietaire")
    private List<Vehicule> vehicules;

}
