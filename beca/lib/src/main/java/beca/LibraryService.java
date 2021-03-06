package beca;

/**
 * @author cjofrevi
 *
 */
public class LibraryService {
	
	/**
	 * convierte todo string a maysucaula
	 * @param palabra
	 * @return
	 */
	public String hacerMayuscula(String palabra) {
		
		return palabra.toUpperCase();
	}
	
	public void saludar() {
		
		System.out.print("muy buenas tardes");
	}
	
	public void esNoche( boolean respuesta) {
		if(respuesta == true) {
			System.out.println("es de noche, a dormir");
		}else {
			System.out.println("es de dia, despiertate");
		}
		
	}

	public int sumar(int a, int b) {
		return a+b;
	}
	
	public boolean esPar( int numero) {
		
		return numero % 2 == 0 ? true : false;
	}

}
