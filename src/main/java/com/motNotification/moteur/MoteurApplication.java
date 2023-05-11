package com.motNotification.moteur;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@EnableWebSecurity

@SpringBootApplication
public class MoteurApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoteurApplication.class, args);
	}

}


