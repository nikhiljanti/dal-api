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
@Table(name="emp")
@SequenceGenerator(name="seqss",initialValue=1,allocationSize = 1)
public class dataModel {
	
	@Id
	@GeneratedValue(generator="seqss",strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	


	@Override
	public String toString() {
		return "dataModel [id=" + id + ", name=" + name + ", age=" + age + "]";
	}




	@OneToMany(targetEntity = projModel.class,fetch =FetchType.LAZY)
	@JoinColumn(name="emp_idfk", referencedColumnName = "id")
	private List<projModel> empdb;
	
	
	
	
}
