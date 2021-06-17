package oop;

public class Salmon extends Pez {
	
	private int velMaxima;
	
	public Salmon( int velMaxima) {
		super();
		this.velMaxima = velMaxima;
	}

	public Salmon(String tipoAgua, int velMaxima) {
		super(tipoAgua);
		this.velMaxima = velMaxima;
	}

	public int getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}
	
	public void chapotear() {
		System.out.println("chapoteo, no es muy efectivo!!");
	}
	
	
	
	

}
