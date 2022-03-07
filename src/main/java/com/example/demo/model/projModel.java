package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="emproj")
@SequenceGenerator(name="seq",initialValue=1,allocationSize = 1)
public class projModel {
	
	@Id
	@GeneratedValue(generator="seq",strategy = GenerationType.IDENTITY)
	private int epid;
	
	public int getId() {
		return epid;
	}
	
	private int emp_idfk;
	private int proj_idfk;

	public int getEmp_idfk() {
		return emp_idfk;
	}

	public void setEmp_idfk(int emp_idfk) {
		this.emp_idfk = emp_idfk;
	}

	public int getProj_idfk() {
		return proj_idfk;
	}

	public void setProj_idfk(int proj_idfk) {
		this.proj_idfk = proj_idfk;
	}

	public void setId(int epid) {
		this.epid = epid;
	}

	@Override
	public String toString() {
		return "projModel [id=" + epid + ", emp_idfk=" + emp_idfk + ", proj_idfk=" + proj_idfk + "]";
	}
	
}
