package com.tut;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="student_address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="adress_id")
	private int addressId;
	@Column(length = 50,name="STREET")
	private String street;
	@Column(length = 100,name="CITY")
	private String city;
	@Column(name = "is_open")
	private boolean isOpean;
	
	@Transient
	private double x;
	@Column(name = "added_date")
	@Temporal(TemporalType.DATE)
  private Date addedDate;
  
  
public Address(int addressId, String street, String city, boolean isOpean, double x, Date addedDate) {
	super();
	this.addressId = addressId;
	this.street = street;
	this.city = city;
	this.isOpean = isOpean;
	this.x = x;
	this.addedDate = addedDate;
}


public Address() {
	super();
	// TODO Auto-generated constructor stub
}





public int getAddressId() {
	return addressId;
}


public void setAddressId(int addressId) {
	this.addressId = addressId;
}


public String getStreet() {
	return street;
}


public void setStreet(String street) {
	this.street = street;
}


public boolean isOpean() {
	return isOpean;
}


public void setOpean(boolean isOpean) {
	this.isOpean = isOpean;
}


public double getX() {
	return x;
}


public void setX(double x) {
	this.x = x;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public Date getAddedDate() {
	return addedDate;
}


public void setAddedDate(Date addedDate) {
	this.addedDate = addedDate;
}


@Override
public String toString() {
	return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpean=" + isOpean + ", x="
			+ x + ", addedDate=" + addedDate + "]";
}
  
  

}
