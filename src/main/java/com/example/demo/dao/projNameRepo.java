package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.projNameModel;


public interface projNameRepo extends JpaRepository<projNameModel, Integer>{
	
	projNameModel findByProj(String projName);
	
}
