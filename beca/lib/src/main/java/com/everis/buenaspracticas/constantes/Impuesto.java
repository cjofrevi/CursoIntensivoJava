package com.everis.buenaspracticas.constantes;

public enum Impuesto {
	CIGARROS(0.12f),
	ALCOHOL(0.05f),
	OTROS(0.0f);
	
	private final float porcentageImpuesto;


	private Impuesto(float porcentageImpuesto) {
		this.porcentageImpuesto = porcentageImpuesto;
	}


	public float getPorcentageImpuesto() {
		return porcentageImpuesto;
	}
	
	
	
	

}
