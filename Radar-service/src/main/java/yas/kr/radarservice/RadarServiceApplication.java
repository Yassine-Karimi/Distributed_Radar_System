package yas.kr.radarservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import yas.kr.radarservice.entities.Radar;
import yas.kr.radarservice.feign.ImmatriculationRestClient;
import yas.kr.radarservice.feign.InfractionRestClient;
import yas.kr.radarservice.repositories.RadarRepository;

@EnableFeignClients
@SpringBootApplication
public class RadarServiceApplication {

    private final RadarRepository radarRepository;
    private final ImmatriculationRestClient immatriculationRestClient;
    private final InfractionRestClient infractionRestClient;

    public RadarServiceApplication(RadarRepository radarRepository, ImmatriculationRestClient immatriculationRestClient, InfractionRestClient infractionRestClient) {
        this.radarRepository = radarRepository;
        this.infractionRestClient = infractionRestClient;
        this.immatriculationRestClient = immatriculationRestClient;
    }

    public static void main(String[] args) {

        SpringApplication.run(RadarServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(RadarRepository radarRepository, ImmatriculationRestClient immatriculationRestClient, InfractionRestClient infractionRestClient,
                            RepositoryRestConfiguration restConfiguration ){
        restConfiguration.exposeIdsFor(Radar.class);
        return args -> {
            for(int i = 0; i < 5; i++) {
                Radar radar = new Radar();
                radar.setMaxSpeed(100.0 + i);
                radar.setLatitude(36.0 + i);
                radar.setLongitude(10.0 + i);
                radarRepository.save(radar);
                System.out.println(radar);
            }
            radarRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });


        };
    }



}
