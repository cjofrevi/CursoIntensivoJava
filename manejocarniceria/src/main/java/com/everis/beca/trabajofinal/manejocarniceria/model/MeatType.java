package com.everis.beca.trabajofinal.manejocarniceria.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MeatType {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdMeatType;
	@Column
	private String meatType;
	@Column
	private int storageDays;
//	@OneToMany(mappedBy ="meatType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
//	private List<Product> product;



	public MeatType() {

	}

	// @OneToMany(mappedBy = "meatType", cascade = CascadeType.ALL)
//	private List<Product> products;
	/**
	 * @return the idMeatType
	 */
	public Integer getIdMeatType() {
		return IdMeatType;
	}

	/**
	 * @param idMeatType the idMeatType to set
	 */
	public void setIdMeatType(Integer idMeatType) {
		this.IdMeatType = idMeatType;
	}

	/**
	 * @return the meatType
	 */
	public String getMeatType() {
		return meatType;
	}

	/**
	 * @param meatType the meatType to set
	 */
	public void setMeatType(String meatType) {
		this.meatType = meatType;
	}

	/**
	 * @return the storageDays
	 */
	public int getStorageDays() {
		return storageDays;
	}

	/**
	 * @param storageDays the storageDays to set
	 */
	public void setStorageDays(int storageDays) {
		this.storageDays = storageDays;
	}
	/**
	 * @return the products
	 */
//	public List<Product> getProducts() {
//		return products;
//	}
	/**
	 * @param products the products to set
	 */
//	public void setProducts(List<Product> products) {
//		if( products != null) {
//			products.forEach(prod -> prod.setMeatType(this));
//		}
//		
//		this.products = products;
//		
//	
//	}

}
