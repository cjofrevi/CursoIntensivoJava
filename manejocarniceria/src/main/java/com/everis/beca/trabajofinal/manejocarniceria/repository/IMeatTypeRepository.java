package com.everis.beca.trabajofinal.manejocarniceria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.beca.trabajofinal.manejocarniceria.model.MeatType;

public interface IMeatTypeRepository extends JpaRepository<MeatType, Integer> {
		
	MeatType findByMeatType(String meatType);
	

}
