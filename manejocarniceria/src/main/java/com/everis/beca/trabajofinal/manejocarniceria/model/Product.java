package com.everis.beca.trabajofinal.manejocarniceria.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Product {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdProduct;
	@Column
	private String description;
//	@Column
//	@ManyToOne(fetch= FetchType.LAZY , optional = false)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="IdMeatType", nullable=false)
//	@JsonManagedReference
	private MeatType meatType;
	@Column
	private double pricePerKilo;
	
	
	
	
	public Product() {
	}
	/**
	 * @return the idProduct
	 */
	public Integer getIdProduct() {
		return IdProduct;
	}
	/**
	 * @param idProduct the idProduct to set
	 */
	public void setIdProduct(Integer idProduct) {
		IdProduct = idProduct;
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
	public MeatType getMeatType() {
		return meatType;
	}
	/**
	 * @param meatType the meatType to set
	 */

	public void setMeatType(MeatType meatType) {
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
