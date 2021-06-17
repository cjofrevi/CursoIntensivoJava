package beca;

public class EjemploArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		int[] numeros = new int[10];
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		
		double num[] = {10.3, 2.5, 3.14};
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		String [][] nombres = new String[2][3];
		
		for(int i=0; i< nombres.length; i++) {
			System.out.println(nombres.length);
			for(int j = 0; j <nombres[i].length; j++) {
				nombres[i][j] = i+" "+j;
			}
		}
		
		for(String [] n: nombres) {
			for(String nombre: n) {
				System.out.println(nombre);
			}
		}
		*/
		
		int [][] arrNum = new int[2][3];
		int count = 0;
		for(int i=0; i< arrNum.length; i++) {
			System.out.println(arrNum.length);
			for(int j = 0; j <arrNum[i].length; j++) {
				arrNum[i][j] = count++ ;
			}
		}
		
		for(int [] n: arrNum) {
			for(int nombre: n) {
				System.out.print(nombre+" ");
			}
			System.out.println("");
		}

	}

}
