package beca;

public abstract class ControlFlujo {
	
	public static void main(String[] args) {
		
//		int contadorWhile = 0;
//		
//		System.out.println("haciendo ejercicio....");
//		
//		while(contadorWhile < 10) {
//			contadorWhile++;
//			System.out.println("Abdominal numero "+contadorWhile);
//		}
//		
//		String nombre = "Cristian";
//		int largoString = nombre.length();
//		int contadorDoWhile = 0;
//		
//		System.out.println("deletree su nombre: ");
//		do {
//			System.out.println(nombre.charAt(contadorDoWhile));
//			contadorDoWhile++;
//		}while(contadorDoWhile < largoString );
		
		System.out.println("cuales son los numeros son pares e impares");
		
		for(int i = 0; i <= 20; i++ ) {
			
			if(i % 2 == 0) {
				System.out.println( i+" es un numero par.");
			}
			else {
				System.out.println(i +" es un numero impar.");
			}
		}	
		
	}

}
