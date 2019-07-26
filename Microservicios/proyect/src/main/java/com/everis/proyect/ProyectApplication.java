package com.everis.proyect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan
public class ProyectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectApplication.class, args);
	}

}
