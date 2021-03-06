package com.everis.buenaspracticas.utils;

import java.util.Arrays;
import java.util.List;

import com.everis.buenaspracticas.constantes.Impuesto;
import com.everis.buenaspracticas.constantes.PersonaJuridica;
import com.everis.buenaspracticas.modelos.Articulo;
import com.everis.buenaspracticas.modelos.Persona;

// TODO: Auto-generated Javadoc
/**
 * Clase Calculadora, que posee methos para calcular compra total asignar enums
 * a clases del package modelo y .
 */
public class Calculadora {

	private Calculadora() {
	}

	/**
	 * Calcular total.
	 *
	 * @param persona       the persona
	 * @param listaArticulo the lista articulo
	 */
	public static void calcularTotal(Persona persona, List<Articulo> listaArticulo) {

		float total = 0;

		//itera listaArticulo para sacar subtotal segunt articulo
		for (Articulo articulo : listaArticulo) {
			total += articulo.getPrecio() * (1 + articulo.getImpuesto());
		}

		//asigna descuento segun edad
		total = persona.getEdad() >= 65 ? total * (0.9f) : total;

		//asigna iva a valor total
		total += total * persona.getPersonaJuridica().getIVA();

		//imprime resultados
		System.out.println("*************************************");
		System.out.println("Cliente : " + persona.getNombre());
		System.out.println("Compro un total de " + total);
		System.out.println("***************************************");
	}

	/**
	 * Asignar impuesto especifico.
	 *
	 * @param articulo the articulo
	 * @return the impuesto
	 */
	public static Impuesto asignarImpuestoEspecifico(String articulo) {

		String articuloUpper = articulo.toUpperCase().trim();

		try {
			return Impuesto.valueOf(articuloUpper);
		} catch (Exception e) {
			return Impuesto.OTROS;
		}
	}

	/**
	 * Asignar personalidad juridica.
	 *
	 * @param personalidad the personalidad
	 * @return the persona juridica
	 */
	public static PersonaJuridica asignarPersonalidadJuridica(String personalidad) {

		String personaJuridicaUpper = personalidad.toUpperCase().trim();

		try {
			return PersonaJuridica.valueOf(personaJuridicaUpper);
		} catch (Exception e) {
			return PersonaJuridica.NATURAL;
		}
	}

}
