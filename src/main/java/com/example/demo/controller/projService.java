package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.projNameRepo;
import com.example.demo.model.projNameModel;
import com.example.demo.model.projPayload;

@Service
public class projService {
	
	@Autowired
	projNameRepo Prepo;
	
	public Boolean addProjData(projPayload pdP) {
		projNameModel pN = new projNameModel();
		pN.setId(pdP.getId());
		pN.setProj(pdP.getProj());
		Prepo.save(pN);
		return true;
	}
}
