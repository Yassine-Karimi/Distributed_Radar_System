package yas.kr.radarservice.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@Builder @ToString
@AllArgsConstructor @NoArgsConstructor
public class Vehicule {
    private Long id;
    private String matricule;
    private String marque;
    private String modele;
    private int puissanceFiscale;
    private Proprietaire proprietaire;
}
