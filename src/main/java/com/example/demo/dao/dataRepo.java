package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.dataModel;

public interface dataRepo extends JpaRepository<dataModel, Integer> {
	
	long countByName(String name);
	
	dataModel findByName(String name);
	
}
