package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.projModel;

@Repository
public interface projEmpRepo extends JpaRepository<projModel, Integer> {
	

}
