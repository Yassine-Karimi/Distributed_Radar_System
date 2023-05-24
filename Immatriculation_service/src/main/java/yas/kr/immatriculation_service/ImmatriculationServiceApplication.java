package yas.kr.immatriculation_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import yas.kr.immatriculation_service.entities.Proprietaire;
import yas.kr.immatriculation_service.entities.Vehicule;
import yas.kr.immatriculation_service.repository.ProprietaireRepository;
import yas.kr.immatriculation_service.repository.VehiculeRepository;


import java.io.IOException;

@SpringBootApplication
public class ImmatriculationServiceApplication {


	public static void main(String[] args) throws IOException {

		SpringApplication.run(ImmatriculationServiceApplication.class, args);


	}

	@Bean
	CommandLineRunner start(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository,
							RepositoryRestConfiguration restConfiguration ){
		restConfiguration.exposeIdsFor(Proprietaire.class);
		restConfiguration.exposeIdsFor((Vehicule.class));
		return args -> {

			proprietaireRepository.save(new Proprietaire(null,"Yassine","08/07/1999","yassine@karimi.com","Adresse 41",null));
			proprietaireRepository.save(new Proprietaire(null,"Layla","05/06/2000","layla@karimi.com","Adresse 42",null));

			vehiculeRepository.save(new Vehicule(null,"78451","DACIA","Logan14",260,null));
			vehiculeRepository.save(new Vehicule(null,"87451","GOLF","7",310,null));

			vehiculeRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});


		};
	}

}
