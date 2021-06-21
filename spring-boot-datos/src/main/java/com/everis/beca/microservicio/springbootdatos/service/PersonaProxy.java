package com.everis.beca.microservicio.springbootdatos.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.beca.microservicio.springbootdatos.dto.PersonaDto;

@FeignClient(name = "persona-service", url = "http://localhost:8000")
public interface PersonaProxy {

	@GetMapping("/find/{username}")
	PersonaDto findUsuario(@PathVariable("username") String username);
	
	@GetMapping("/findNombre/{nombre}")
	List<PersonaDto> findUsuarioPorNombre(@PathVariable("nombre") String nombre);
		
		

}

