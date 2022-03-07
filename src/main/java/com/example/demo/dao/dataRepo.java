package com.example.demo.dao;



import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.dataModel;

@Repository
public interface dataRepo extends JpaRepository<dataModel, Integer> {
	
	long countByName(String name);
	
	dataModel findByName(String name);
	
	@Transactional
	@Modifying
	@Query(value="select emp.id,emp.name,emp.age,projname.proj from emp inner join emproj on emp.id=emproj.emp_idfk inner join projname on projname.pid=emproj.proj_idfk where emp.id = :eid", nativeQuery = true)
	String[] getAllData(@Param("eid") int eid);
	
}
