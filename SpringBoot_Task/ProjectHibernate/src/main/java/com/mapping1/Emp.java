package com.mapping1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity
public class Emp {
	
	@Id
	private int emp_id;
	@Column(name = "emp_name")
	private String empName;
	
	@ManyToMany
	@JoinTable(name = "emp_data",joinColumns = {@JoinColumn(name= "eid")},inverseJoinColumns = {@JoinColumn(name="pid")})
	private List<Project>projects;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Emp(int emp_id, String empName, List<Project> projects) {
		super();
		this.emp_id = emp_id;
		this.empName = empName;
		this.projects = projects;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
	
	

