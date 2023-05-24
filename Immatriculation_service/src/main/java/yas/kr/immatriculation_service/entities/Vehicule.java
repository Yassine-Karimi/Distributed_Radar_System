package yas.kr.immatriculation_service.entities;
import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String marque;
    private String modele;
    private int puissanceFiscale;
    @ManyToOne
    private Proprietaire proprietaire;

    // constructeurs, getters, setters
}