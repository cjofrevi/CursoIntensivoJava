package com.everis.beca.springbootpersona.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

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
	
	@Query("select p from Persona p where p.direccion = ?1")
	List<Persona> findPorDireccion(String direccion);
		
	

}
