package abstraccion;

public class PrincipalFigura {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	
		
		Rectangulo rectangulo = new Rectangulo(2.5f, 1.6f);
		System.out.println("Rectangulo");
		System.out.println("Lados : " + rectangulo.getLados());
		System.out.println("Perimetro : " + rectangulo.getPerimetro());
		System.out.println("Area : "+ rectangulo.getArea());
		
		Cuadrado cuadrado = new Cuadrado(24);
		System.out.println("Cuadrado");
		System.out.println("Lados : "+cuadrado.getLados());
		System.out.println("Perimetro : "+cuadrado.getPerimetro());
		System.out.println("Area : "+cuadrado.getArea());
		
		int num = 4;
		
		if(num == 3) {
			System.out.println("its three");
		} else {
			System.out.println("isnt 3");
		}

	}

}
