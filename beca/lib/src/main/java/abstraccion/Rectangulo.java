package abstraccion;

public class Rectangulo extends Figura {
	
	private float largo;
	private float ancho;
	
	

	public Rectangulo(float largo, float ancho) {
		
		this.largo = largo;
		this.ancho = ancho;
		setLados(4);
	}

	@Override
	public float getArea() {
		
		return largo * ancho;
	}

	@Override
	public float getPerimetro() {

		return (largo + ancho) * 2;
	}

}
