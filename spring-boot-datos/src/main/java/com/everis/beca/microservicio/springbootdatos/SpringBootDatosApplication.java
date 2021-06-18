package com.everis.beca.microservicio.springbootdatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.openfeign.EnableFeignClients
public class SpringBootDatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDatosApplication.class, args);
	}

}
