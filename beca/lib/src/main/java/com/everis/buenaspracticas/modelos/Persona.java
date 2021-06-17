package com.everis.buenaspracticas.modelos;

import com.everis.buenaspracticas.constantes.PersonaJuridica;
import com.everis.buenaspracticas.utils.Calculadora;

// TODO: Auto-generated Javadoc
/**
 * Clase Persona.
 */
public class Persona {

	/** String nombre. */
	private String nombre;
	
	/** int edad. */
	private int edad;
	
	/** PersonaJuridica personaJuridica. */
	private PersonaJuridica personaJuridica;



	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 * @param edad the edad
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * Asigna persona juridica segun string personaJuridica con methodo estatico asignarPersonalidadJuridica
	 * de clase Calculadora.
	 *
	 * @param nombre the nombre
	 * @param edad the edad
	 * @param personaJuridica the persona juridica
	 */
	public Persona(String nombre, int edad, String personaJuridica) {
		this.nombre = nombre;
		this.edad = edad;
		this.personaJuridica = Calculadora.asignarPersonalidadJuridica(personaJuridica) ;
	}

	/**
	 * Retorna el nombre.
	 *
	 * @return String nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nombre.
	 *
	 * @param int nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Retorna el edad.
	 *
	 * @return int edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Asigna el edad.
	 *
	 * @param int edad 
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Retorna el persona juridica.
	 *
	 * @return PersonaJuridica juridica
	 */
	public PersonaJuridica getPersonaJuridica() {
		return this.personaJuridica;
	}
	
	



}
