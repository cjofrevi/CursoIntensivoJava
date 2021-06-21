package com.everis.beca.trabajofinal.manejocarniceria.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Inventory {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdInventory;
	@ManyToOne
	@JoinColumn(name="IdProduct", nullable=false)
	private Product product;
	@Column
	private int quantity;
	@Column
	private LocalDate dateArrive;
	/**
	 * @return the idInventory
	 */
	public Integer getIdInventory() {
		return IdInventory;
	}
	/**
	 * @param idInventory the idInventory to set
	 */
	public void setIdInventory(Integer idInventory) {
		IdInventory = idInventory;
	}
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the dateArrive
	 */
	public LocalDate getDateArrive() {
		return dateArrive;
	}
	/**
	 * @param dateArrive the dateArrive to set
	 */
	public void setDateArrive(LocalDate dateArrive) {
		this.dateArrive = dateArrive;
	}
	
	

}
