package yas.kr.infractionsservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Data @Entity
@ToString @Builder
@AllArgsConstructor @NoArgsConstructor
public class Infraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private Double vehicleSpeed;
    private Double radarMaxSpeed;
    private Double fineAmount;
    private Long radarId;
    private Long vehicleId;
}