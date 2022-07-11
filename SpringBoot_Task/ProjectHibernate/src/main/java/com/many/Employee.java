 package com.many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	private int empId;
    private String employee;
	
	@OneToMany
	private List<Address> address;
	
	public int getEmpId() {
		return empId;
	  }
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employee=" + employee + ", address=" + address + "]";
	}
	public Employee(int empId, String employee, List<Address> address) {
		super();
		this.empId = empId;
		this.employee = employee;
		this.address = address;
	}
	public Employee() {
		super();
		
	}


}
