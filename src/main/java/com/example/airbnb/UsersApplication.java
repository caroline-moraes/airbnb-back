package com.example.airbnb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class);
	}
		
		@Bean
		public CommandLineRunner user(UsersRepository repository) {
			return (args) -> {
				//String name, String socialName, String email, String password, String dtBirth, String gender
				repository.save(new Users("Caroline Moraes", " ", "carol@gmail.com", "12345", "0509", "F"));
				
			};
		}
}

