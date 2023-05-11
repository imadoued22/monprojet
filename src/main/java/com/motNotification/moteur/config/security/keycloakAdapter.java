package com.motNotification.moteur.config.security;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class keycloakAdapter {
	@Bean
   public KeycloakSpringBootConfigResolver springBootConfigResolver() {
	   return new KeycloakSpringBootConfigResolver();
   }
}
