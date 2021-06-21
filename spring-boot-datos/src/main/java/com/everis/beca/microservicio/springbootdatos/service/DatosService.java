package com.everis.beca.microservicio.springbootdatos.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.microservicio.springbootdatos.dto.Datos;
import com.everis.beca.microservicio.springbootdatos.dto.PersonaDto;

@Service
public class DatosService {

	@Autowired
	private PersonaProxy personaProxy;
	
	public Datos getDatos(String username) {
		
		PersonaDto persona = personaProxy.findUsuario(username);
		
		return setDatos(persona);
		

		
	}
	
	public List<Datos> getListaUsuarioPorNombre(String nombre) {
		
		List<PersonaDto> ListPersona = personaProxy.findUsuarioPorNombre(nombre);
		List<Datos> ListDatos = new ArrayList<>();
		
		for(PersonaDto p: ListPersona ) {
			
			ListDatos.add(setDatos(p));
				
		}
		
		return ListDatos;
		
	}
	
	private static Datos setDatos(PersonaDto persona) {
		
		Datos datos = new Datos();
		datos.setUsername(persona.getUsername());
		datos.setDireccion(persona.getDireccion());
		datos.setNombreCompleto(persona.getNombre()+" "+persona.getApellido());
		datos.setPuerto(persona.getPort());
	
		LocalDate actual = LocalDate.now();
		LocalDate nac = persona.getFechaNacimiento();
		
		datos.setEdad(Period.between(nac, actual).getYears());
		
		return datos;
		
		
		
	}
	
}
