package oop;

public class Pez extends Animal {
	
	private String tipoAgua;

	public Pez() {
		super();

	}
	public Pez(String tipoAgua) {
		super();
		this.tipoAgua = tipoAgua;
	}
	


	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}
	
	

}
