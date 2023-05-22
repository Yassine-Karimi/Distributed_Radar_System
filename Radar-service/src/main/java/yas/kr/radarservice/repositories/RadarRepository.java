package yas.kr.radarservice.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import yas.kr.radarservice.entities.Radar;

@RestResource
public interface RadarRepository extends JpaRepository<Radar, Long> {

}
