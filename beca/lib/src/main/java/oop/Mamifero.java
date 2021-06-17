package oop;

public class Mamifero extends Animal {
	private int patas;
	private String nombres;

	public Mamifero(int patas, String nombres) {

		this.patas = patas;
		this.nombres = nombres;
	}

	public void imprimirPatas() {
		System.out.println(nombres + " tiene " + patas + " patas");
	}

}
