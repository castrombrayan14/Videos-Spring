package com.everis.serverZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
@ComponentScan
public class ServerZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerZuulApplication.class, args);
	}

}
