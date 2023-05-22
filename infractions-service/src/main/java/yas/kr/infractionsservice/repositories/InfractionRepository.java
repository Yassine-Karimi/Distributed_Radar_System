package yas.kr.infractionsservice.repositories;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import yas.kr.infractionsservice.entities.Infraction;

import java.util.List;

@RestResource
public interface InfractionRepository extends JpaRepository<Infraction, Long> {
    List<Infraction> findByRadarId(Long radarId);
}