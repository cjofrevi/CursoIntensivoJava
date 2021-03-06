package com.everis.buenaspracticas.modelos;

import com.everis.buenaspracticas.constantes.Impuesto;
import com.everis.buenaspracticas.utils.Calculadora;

// TODO: Auto-generated Javadoc
/**
 * Clase Articulo.
 */
public class Articulo {
	
	/** String articulo. */
	private String articulo;
	
	/** int  precio. */
	private int precio;
	
	/** Impuesto impuesto. */
	private Impuesto impuesto;
	
	/**
	 * asigna tipo de impuesto segun string articulo con  metodo estatico  asignarImpuesto de 
	 * clase Calculadora.
	 *
	 * @param articulo the articulo
	 * @param precio the precio
	 */
	
	public Articulo(String articulo, int precio) {
		this.articulo = articulo;
		this.precio = precio;
		this.impuesto =  Calculadora.asignarImpuestoEspecifico(articulo) ;
		
	}

	/**
	 * retorna el articulo.
	 *
	 * @return String articulo.
	 */
	public String getArticulo() {
		return articulo;
	}

	/**
	 * asigna el articulo.
	 *
	 * @param String articulo
	 */
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	/**
	 * retorna el  precio.
	 *
	 * @return int precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * asigna el precio.
	 *
	 * @param int precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
		
	/**
	 * retorna el impuesto.
	 *
	 * @return float impuesto
	 */
	public float getImpuesto() {
		return impuesto.getPorcentageImpuesto();
	}

}
