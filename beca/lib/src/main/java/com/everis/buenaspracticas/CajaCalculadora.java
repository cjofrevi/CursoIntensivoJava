package com.everis.buenaspracticas;

import java.util.ArrayList;
import java.util.List;

import com.everis.buenaspracticas.modelos.Articulo;
import com.everis.buenaspracticas.modelos.Persona;
import com.everis.buenaspracticas.utils.Calculadora;

public class CajaCalculadora {

	public static void main(String[] args) {
	
		//asignar Clientes
		Persona juanPerez = new Persona("Juan Perez", 78, "natural");
		Persona ComercialLtda = new Persona("Comercial LTDA", 20, "juridica");
		
		//asignar articulo
		Articulo cigarrosCarros = new Articulo("cigarro", 5000);
		Articulo cigarrosBaratos = new Articulo("cigarro", 1000);
		Articulo whiskyCaro = new Articulo("alcohol", 30000);
		Articulo vinoBarato = new Articulo("alcohol", 1500);
		Articulo papitas = new Articulo("papitas", 1000);
		
		//crear list de articulos
		List<Articulo> listaArticulos = new ArrayList<>();
		listaArticulos.add(cigarrosCarros);
		listaArticulos.add(cigarrosBaratos);
		listaArticulos.add(whiskyCaro);
		listaArticulos.add(vinoBarato);
		listaArticulos.add(papitas);
		
		//Calcular total de compras
		Calculadora.calcularTotal(ComercialLtda, listaArticulos);
		Calculadora.calcularTotal(juanPerez, listaArticulos);
		
		
	}
}
