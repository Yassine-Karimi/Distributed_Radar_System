package yas.kr.infractionsservice;


import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import yas.kr.infractionsservice.entities.Infraction;
import yas.kr.infractionsservice.repositories.InfractionRepository;

@SpringBootApplication
@AllArgsConstructor
public class InfractionServiceApplication implements CommandLineRunner {

    private final InfractionRepository infractionRepository;

    public static void main(String[] args) {
        SpringApplication.run(InfractionServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Add some infractions
        for(int i = 0; i < 2; i++) {
            Infraction infraction = Infraction.builder()
                    .id(null)
                    .date("2021-01-01")
                    .vehicleSpeed(110.0 + i*10)
                    .radarMaxSpeed(100.0 + i*10)
                    .fineAmount(100.0 + i*10)
                    .radarId(null)
                    .vehicleId(null)
                    .build();
            infractionRepository.save(infraction);
            System.out.println(infraction);
        }
    }
}