package com.many;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Address {
	@Id
	private int addressId;


	private String address;

	@ManyToOne
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address=" + address + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


}
