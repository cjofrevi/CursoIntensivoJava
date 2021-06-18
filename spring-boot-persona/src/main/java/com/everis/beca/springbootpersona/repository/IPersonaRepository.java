package com.everis.beca.springbootpersona.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.beca.springbootpersona.mapper.Persona;

// TODO: Auto-generated Javadoc
/**
 * The Interface IPersonaRepository.
 */
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {
	
	/**
	 * Find by username.
	 *
	 * @param username the username
	 * @return the persona
	 */
	Persona findByUsername(String username);
	
	List<Persona> findByNombre(String nombre);
	
	List<Persona> findByApellido(String apellido);
		
	

}
