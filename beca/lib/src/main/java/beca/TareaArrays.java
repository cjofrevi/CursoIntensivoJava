package beca;

public class TareaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lista del 1 al 100: ");
		for (int i : arregloCien()) {
			System.out.println(i);
		}

		System.out.println("lista de los primeros 100 pares: ");
		int[] array = arregloPares();
		for (int i = 0; i < 10; i++) {

			System.out.println(array[i]);
		}

		System.out.println("piramide de n lineas: ");
		arregloPiramide(8);

	}

	public static int[] arregloCien() {
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = i + 1;
		}

		return array;
	}

	public static int[] arregloPares() {
		int[] array = new int[100];

		int indice = 0;
		int numero = 0;
		while (indice < array.length) {
			if (numero % 2 == 0) {
				array[indice] = numero;
				indice++;
			}
			numero++;
		}
		return array;
	}

	public static void arregloPiramide(int lineas) {

		String[] array = new String[lineas];
		int count = 1;

		for (int i = 0; i < array.length; i++) {

			int ini = 0;
			String linea = "";
			while (ini <= i) {
				linea = linea + ", " + count;
				count++;
				ini++;
			}

			linea = linea.substring(2);
			linea = "[" + i + "]: " + linea;
			array[i] = linea;
		}

		for (String linea : array) {
			System.out.println(linea);
		}

	}

}
