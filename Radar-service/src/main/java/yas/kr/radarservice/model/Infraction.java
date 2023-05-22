package yas.kr.radarservice.model;
import lombok.*;
import yas.kr.radarservice.entities.Radar;

@Data  @ToString  @Builder
@AllArgsConstructor @NoArgsConstructor
public class Infraction {
    private Long id;
    private String date;
    private Double vehiculeSpeed;
    private Double radarMaxSpeed;
    private Double fineAmount;
    private Long radarId;
    private Long vehiculeId;
    private Vehicule vehicule;
    private Radar radar;
}