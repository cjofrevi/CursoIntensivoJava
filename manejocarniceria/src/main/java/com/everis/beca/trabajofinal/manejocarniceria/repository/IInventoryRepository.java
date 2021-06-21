package com.everis.beca.trabajofinal.manejocarniceria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.beca.trabajofinal.manejocarniceria.model.Inventory;

public interface IInventoryRepository extends JpaRepository<Inventory, Integer> {

}
