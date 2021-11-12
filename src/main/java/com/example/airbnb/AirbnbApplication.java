package com.example.airbnb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AirbnbApplication {
	
	private static final Logger log = LoggerFactory.getLogger(AirbnbApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AirbnbApplication.class);
	}
	
	@Bean
	public CommandLineRunner demo(PropertiesRepository repository) {
		return (args) -> {
			repository.save(new Properties("Flat vista para o mar", "Estacionamento gratuito - Wi-fi - Cozinha - Ar condicionado", "Torres"));
			repository.save(new Properties("Apartamento vista para o mar", "Estacionamento gratuito - Wi-fi - Cozinha - Ar condicionado", "Torres"));
			repository.save(new Properties("Casa moderna vista para o mar", "Estacionamento gratuito - Wi-fi - Cozinha - Ar condicionado", "Torres"));
			
			log.info("Accommodations found with findAll():");
		    log.info("-------------------------------");
		    for (Properties properties : repository.findAll()) {
		        log.info(properties.toString());
		    }
		    log.info("");
		    
		    log.info("Accommodations found with findByLocal('Torres'):");
		    log.info("--------------------------------");
		    repository.findByLocalization("Torres").forEach(torres -> {
		        log.info(torres.toString());
		      });
		};
	}

}
