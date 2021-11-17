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
			repository.save(new Properties("Flat vista para o mar", "Estacionamento gratuito - Wi-fi - Cozinha - Ar condicionado", "Torres", 309.00, "Maria", false));
			repository.save(new Properties("Apartamento vista para o mar", "Estacionamento gratuito - Wi-fi - Cozinha - Ar condicionado", "Torres", 459.00, "Marcus", false));
			repository.save(new Properties("Casa moderna vista para o mar", "Estacionamento gratuito - Wi-fi - Cozinha - Ar condicionado", "Torres", 699.00, "Alex", false));
			repository.save(new Properties("Espaço inteiro: apartamento", "Apartamento no centro de Gramado, localizado a 300 metros da Rua Coberta.", "Gramado", 235.00, "Vitor", false));
			repository.save(new Properties("Espaço inteiro: casa residencial", "Vista para o horizonte da cidade. Cozinha - Wi-Fi - Estacionamento incluído", "Gramado", 188.00, "Alex", false));
			repository.save(new Properties("Quarto inteiro em resort", "O Golden Gramado Laghetto Resort traz na essência a inspiração em receptividade e conforto que só a Laghetto Hotéis possui na Serra Gaúcha.", "Gramado", 200.00, "Marcus", false));
			
			log.info("Accommodations found with findAll():");
		    log.info("-------------------------------");
		    for (Properties properties : repository.findAll()) {
		        log.info(properties.toString());
		    }
		    log.info("");
		    
		    log.info("Accommodations found with findByLocal('Torres'):");
		    log.info("--------------------------------");
		    repository.findByLocation("Torres").forEach(torres -> {
		        log.info(torres.toString());
		      });
		};
	}

}
