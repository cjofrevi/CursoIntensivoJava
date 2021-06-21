package com.everis.beca.trabajofinal.manejocarniceria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.beca.trabajofinal.manejocarniceria.model.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
