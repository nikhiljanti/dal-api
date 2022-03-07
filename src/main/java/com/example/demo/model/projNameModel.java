package com.example.demo.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="projname")
@SequenceGenerator(name="seqs",initialValue=1,allocationSize = 1)
public class projNameModel {
	
	@Id
	@GeneratedValue(generator="seqs",strategy = GenerationType.IDENTITY)
	private int pid;
	private String proj;
	public int getId() {
		return pid;
	}
	public void setId(int pid) {
		this.pid = pid;
	}
	public String getProj() {
		return proj;
	}
	public void setProj(String proj) {
		this.proj = proj;
	}
	@Override
	public String toString() {
		return "projNameModel [id=" + pid + ", proj=" + proj + "]";
	}
	
	@OneToMany(targetEntity = projModel.class,fetch =FetchType.LAZY)
	@JoinColumn(name="proj_idfk",referencedColumnName = "pid")
	private List<projModel> prndb;
	
	
}
