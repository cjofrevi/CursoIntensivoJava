package com.everis.beca.springbootpersona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beca.springbootpersona.mapper.Persona;
import com.everis.beca.springbootpersona.repository.IPersonaRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class PersonaController.
 */
@RestController
public class PersonaController {

	/** The repository. */
	@Autowired
	private IPersonaRepository repository;

	/**
	 * Find usuario.
	 *
	 * @param username the username
	 * @return the persona
	 */
	@GetMapping("/find/{username}")
	public Persona findUsuario(@PathVariable("username") String username) {
		return repository.findByUsername(username);
	}

	/**
	 * Find usuario por nombre.
	 *
	 * @param nombre the nombre
	 * @return the list
	 */
	@GetMapping("/findNombre/{nombre}")
	public List<Persona> findUsuarioPorNombre(@PathVariable("nombre") String nombre) {
		return repository.findByNombre(nombre);
	}

	/**
	 * Save.
	 *
	 * @param persona the persona
	 * @return the persona
	 */
	@PostMapping("/save")
	public Persona save(@RequestBody Persona persona) {
		return repository.save(persona);
	}

	@PostMapping("/saveAll")
	public List<Persona> saveAll(@RequestBody List<Persona> listaPersona) {

		return repository.saveAll(listaPersona);
	}

	/**
	 * Find all usuarios.
	 *
	 * @return the list
	 */
	@GetMapping("/findAll")
	public List<Persona> findAllUsuarios() {
		return repository.findAll();

	}
	
	@GetMapping("/findApellido/{apellido}")
	public List<Persona> findUsuarioPorApellido(@PathVariable("apellido") String apellido){
		
		return repository.findByApellido(apellido);
	}
	
	

}
