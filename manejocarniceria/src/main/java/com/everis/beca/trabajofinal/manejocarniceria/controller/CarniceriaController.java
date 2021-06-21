package com.everis.beca.trabajofinal.manejocarniceria.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beca.trabajofinal.manejocarniceria.model.Inventory;
import com.everis.beca.trabajofinal.manejocarniceria.model.MeatType;
import com.everis.beca.trabajofinal.manejocarniceria.model.Product;
import com.everis.beca.trabajofinal.manejocarniceria.modelhelper.ProductHelper;
import com.everis.beca.trabajofinal.manejocarniceria.repository.IInventoryRepository;
import com.everis.beca.trabajofinal.manejocarniceria.repository.IMeatTypeRepository;
import com.everis.beca.trabajofinal.manejocarniceria.repository.IProductRepository;

@RestController
public class CarniceriaController {

	@Autowired
	private IInventoryRepository inventoryRepository;
	@Autowired
	private IMeatTypeRepository meatTypeRepository;
	@Autowired
	private IProductRepository productRepository;

	/*
	 * MeatType
	 */

	@GetMapping("MeatType/findById/{idMeatType}")
	public MeatType findMeatTypeById(@PathVariable("idMeatType") Integer idMeatType) {

		return meatTypeRepository.getById(idMeatType);
	}

	@GetMapping("MeatType/findByMeatType/{meatType}")
	public MeatType findByMeatType(String meatType) {

		return meatTypeRepository.findByMeatType(meatType);
	}

	@GetMapping("MeatType/findAll")
	public List<MeatType> findAllMeatType() {
		return meatTypeRepository.findAll();
	}

	@PostMapping("MeatType/saveAll")
	public List<MeatType> saveListMeatType(@RequestBody List<MeatType> listMeatType) {

		return meatTypeRepository.saveAll(listMeatType);
	}

	/*
	 * Product
	 */

	@PostMapping("Product/saveAll")
	public List<Product> saveListProduct(@RequestBody List<ProductHelper> listProductJson) {

//		listProduct.stream().forEach(prod -> prod.)

		List<Product> listProduct = new ArrayList<>();

		for (ProductHelper productHelper : listProductJson) {
			Product prod = new Product();
			prod.setDescription(productHelper.getDescription());
			prod.setMeatType(meatTypeRepository.getById((productHelper.getMeatType())));
			prod.setPricePerKilo(productHelper.getPricePerKilo());
			listProduct.add(prod);
		}

		return productRepository.saveAll(listProduct);

	}

	@GetMapping("Product/findAll")
	public List<Product> findAllProduct() {

		return productRepository.findAll();
	}

	@GetMapping("Product/findById/{idProduct}")
	public Optional<Product> findProductById(@PathVariable("idProduct") Integer idProduct) {
		return productRepository.findById(idProduct);
	}

	/*
	 * Inventory
	 */

	@PostMapping("Inventory/saveAll/{listInventory}")
	public List<Inventory> saveAllInventory(@RequestBody List<Inventory> listInventory) {

		return inventoryRepository.saveAll(listInventory);
	}

	@GetMapping("Inventory/findAll")
	public List<Inventory> findAllInventory() {
		return inventoryRepository.findAll();
	}

	@GetMapping("Inventory/findById/{idInventory}")
	public Optional<Inventory> findInventoryById(@PathVariable("idInventory") Integer idInventory) {

		return inventoryRepository.findById(idInventory);
	}
}
