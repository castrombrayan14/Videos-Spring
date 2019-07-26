package com.everis.servicioA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableFeignClients
@SpringBootApplication
@ComponentScan
public class ServicioAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioAApplication.class, args);
	}

}
