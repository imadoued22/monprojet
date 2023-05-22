package com.motNotification.moteur;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableWebSecurity
@RestController
@SpringBootApplication
public class MoteurApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoteurApplication.class, args);
	}



	@CrossOrigin
	@GetMapping("/ping")
	public String hello(){
		return "hello springboot";
	}

}





