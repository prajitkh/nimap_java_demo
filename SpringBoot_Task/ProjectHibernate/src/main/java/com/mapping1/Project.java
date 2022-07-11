package com.mapping1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.hibernate.engine.spi.Mapping;

@Entity
public class Project {

	@Id
	private int id;
	@Column(name = "project_name")
	private String name;

	@ManyToMany(mappedBy = "projects")
	private List<Emp>emp;

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

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

	public Project(int id, String name, List<Emp> emp) {
		super();
		this.id = id;
		this.name = name;
		this.emp = emp;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}



}
