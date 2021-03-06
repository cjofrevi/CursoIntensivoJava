package beca.optional;

import java.util.Optional;

import beca.OperacionesBasicas;

/**
 * 
 * La clase library es un ejemplo simple para imprimir en terminal mensaje "hola
 * mundo".
 * 
 * @author cjofrevi
 * 
 */
public class LibraryOptional {
	
//	static LibraryService libraryservice = new LibraryService() ;

	/**
	 * Este es el metodo main que imprime en terminal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

//		System.out.println("Hola a todos");
		
//		Integer a = OperacionesBasicasOptional.sumar(5, 3);
//		System.out.println("paso a sumar");
//		
//		Optional<Integer> suma = Optional.of(a);
//		suma.orElse(null);
//		System.out.println("7 + 3 = "+ (suma.isPresent() ? suma: ""));
		
		Integer resta = OperacionesBasicas.restar(null, 5);
		System.out.println("10 - 5 = " + resta);
		
		Integer dividir = OperacionesBasicas.dividir(8, 0);
		System.out.println(" 8 / 0 = " + dividir);
		
		Integer multiplicar = OperacionesBasicas.multiplicar(4, 5);
		System.out.println(" 4 * 5 = "+multiplicar);
		
	}

	/**
	 * Metodo que siempre retorna true cuando es llamado.
	 * 
	 * @return true
	 */
	public boolean someLibraryMethod() {
		return true;
	}
}
