package com.everis.beca.trabajofinal.manejocarniceria.modelhelper;

public class ProductHelper {

	
	private String description;
	private int meatType;
	private double pricePerKilo;
	
	
	
	public ProductHelper() {
	}



	public ProductHelper( String description, int meatType, double pricePerKilo) {

		this.description = description;
		this.meatType = meatType;
		this.pricePerKilo = pricePerKilo;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the meatType
	 */
	public int getMeatType() {
		return meatType;
	}

	/**
	 * @param meatType the meatType to set
	 */
	public void setMeatType(int meatType) {
		this.meatType = meatType;
	}

	/**
	 * @return the pricePerKilo
	 */
	public double getPricePerKilo() {
		return pricePerKilo;
	}

	/**
	 * @param pricePerKilo the pricePerKilo to set
	 */
	public void setPricePerKilo(double pricePerKilo) {
		this.pricePerKilo = pricePerKilo;
	}
	
	
	
	
	
}
