package oop;

public class PrincipalAnimal {

	public static void main(String[] args) {
		
		Perro bobi = new Perro("Bobi");
		
		bobi.imprimirPatas();
		
		bobi.setColor("negro");
		
		System.out.println("color es : "+bobi.getColor());
		
		Mamifero gato = new Gato("Tom");
		gato.imprimirPatas();

		Salmon salmon = new Salmon(20);
		
		salmon.chapotear();
		

	
	}

}
