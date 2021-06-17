package abstraccion;

public class Cuadrado extends Figura {
	
	private float lado;
	
	

	/**
	 * Instantiates a new cuadrado.
	 *
	 * @param lado the lado
	 */
	public Cuadrado(float lado) {
		this.lado = lado;
		setLados(4);
	}

	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	@Override
	public float getArea() {
		
		return lado * lado;
	}

	@Override
	public float getPerimetro() {
		// TODO Auto-generated method stub
		return lado * getLados();
	}

}
