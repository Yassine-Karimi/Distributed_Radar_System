package yas.kr.radarservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@ToString @Builder
@AllArgsConstructor @NoArgsConstructor
public class Proprietaire {

    private Long id;
    private String nom;
    private String dateNaissance;
    private String email;
    private String adresse;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Vehicule> vehicules;

}
