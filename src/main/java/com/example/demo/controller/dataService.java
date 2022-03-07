package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.dataRepo;
import com.example.demo.dao.projEmpRepo;
import com.example.demo.dao.projNameRepo;
import com.example.demo.model.dataModel;
import com.example.demo.model.dataPayload;
import com.example.demo.model.projModel;
import com.example.demo.model.projNameModel;

@Service
public class dataService {
	
	@Autowired
	dataRepo repo;
	
	@Autowired
	projEmpRepo peRepo;
	
	@Autowired
	projNameRepo pRepo;
	
	public Boolean addEmpData(dataPayload dP) {
		
			long count = repo.countByName(dP.getName());
			
			if(count > 0) {
					
				dataModel name = repo.findByName(dP.getName());
				projModel pdb = new projModel();
				pdb.setId(dP.getId());
				pdb.setEmp_idfk(name.getId());
				String projN = dP.getProj();
				projNameModel pId = pRepo.findByProj(projN);
				pdb.setProj_idfk(pId.getId());
				peRepo.save(pdb);

			}else {
				
				dataModel db = new dataModel();
				db.setId(dP.getId());
				db.setName(dP.getName());
				db.setAge(dP.getAge());
				repo.save(db);
				
				String projN = dP.getProj();
				projNameModel pId = pRepo.findByProj(projN);
				
				projModel pdb = new projModel();
				pdb.setId(dP.getId());
				pdb.setEmp_idfk(db.getId());
				pdb.setProj_idfk(pId.getId());
				peRepo.save(pdb);
				
			}
			
		return true;
	}

}
