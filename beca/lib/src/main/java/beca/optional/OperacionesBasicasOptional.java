package beca.optional;

/**
 * clase que realiza operaciones basicas para numeros enteros, solo utiliza como
 * argumentos enteros.
 * 
 * @author cjofrevi
 *
 */

public class OperacionesBasicasOptional {

	/**
	 * Suma enteros.
	 * @param Integer a
	 * @param Integer b     
	 * @return a + b
	 */
	public static Integer sumar(Integer a, Integer b) {
		System.out.println("adentro sumar");
		Integer resultado = null;
		System.out.println("adentro sumar");
		if (sonNullos(a, b)) {
			
			resultado = a + b;
		}
		return resultado;
	}

	/**
	 * resta enteros.
	 * 
	 * @param Integer a
	 * @param Integer b
	 * @return a - b
	 */
	public static Integer restar(Integer a, Integer b) {

		Integer resultado = 0;
		if (sonNullos(a, b)) {
			resultado = a - b;
		}
		return resultado;
	}

	/**
	 * Divide enteros, verifica que divisor sea diferente de cero.
	 * 
	 * @param Integer a
	 * @param Integer b
	 * @return a / b
	 */
	public static Integer dividir(int a, int b) {

		Integer resultado = 0;
		if (b == 0) {
			System.out.println("ingrese numero diferente a 0");
		} else if (sonNullos(a, b)) {
			resultado = a / b;
		}
		return resultado;
	}

	/**
	 * multiplica enteros.
	 * 
	 * @param Integer a
	 * @param Integer b
	 * @return Integer a * b
	 */
	public static Integer multiplicar(int a, int b) {

		Integer resultado = 0;
		if (sonNullos(a, b)) {
			resultado = a * b;
		}
		return resultado;

	}

	/**
	 * Comprueba si los parametros son nulos
	 * 
	 * @param Integer a
	 * @param Integer b
	 * @return boolean true si es nulo, false en caso contrario;
	 */

	private static boolean sonNullos(Integer a, Integer b) {

		boolean nulo = false;

		if (a == null && b == null) {
			System.out.println("no permite nulos");
			nulo = true;
		}

		return nulo;

	}
}
