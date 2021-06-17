package abstraccion;

public abstract class Figura {
	
	private int lados;
	 	
	public void setLados(int lados) {
		this.lados = lados;
	}
	
	public int getLados() {
		return lados;
	}
	
	public abstract float getArea();
	public abstract float getPerimetro();
	
}
