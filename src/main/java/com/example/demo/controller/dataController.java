package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.dataRepo;
import com.example.demo.model.dataModel;
import com.example.demo.model.dataPayload;
import com.example.demo.model.projPayload;

@RestController
public class dataController {
	
	
	// Inserting the project names.
	
	@Autowired
	projService pS;
	
	@PostMapping("/addProj")
	public ResponseEntity<Boolean> addProj(@RequestBody projPayload projPayload)
    {
        Boolean Ok = pS.addProjData(projPayload);
        return new ResponseEntity<>(Ok, HttpStatus.CREATED);
    }
	
	// Adding the employees
	@Autowired
	private dataService dS;
	
	@PostMapping("/AddEmp")
    public ResponseEntity<Boolean> addEmployee(@RequestBody dataPayload payload)
    {
        Boolean Ok = dS.addEmpData(payload);
        return new ResponseEntity<>(Ok, HttpStatus.CREATED);
    }

	// Getting the employees
	@Autowired
	dataRepo repo;
	
	@GetMapping("/show")
	@ResponseBody
	public List<dataModel> getData(){
		return repo.findAll();
	}
		
}
