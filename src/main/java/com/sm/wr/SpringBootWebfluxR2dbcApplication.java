package com.sm.wr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class SpringBootWebfluxR2dbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebfluxR2dbcApplication.class, args);
	}

}
