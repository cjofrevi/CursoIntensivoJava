package com.everis.buenaspracticas.constantes;

public enum PersonaJuridica {
	
	NATURAL(0.19f),
	JURIDICA(0.22f);
	
	private final float impuesto;

	private PersonaJuridica(float impuesto) {
		this.impuesto = impuesto;
	}

	public float getIVA() {
		return impuesto;
	}
	
	

}
