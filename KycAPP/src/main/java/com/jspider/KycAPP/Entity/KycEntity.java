package com.jspider.KycAPP.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="kyc_data")
public class KycEntity implements Serializable {

	@Id
	@Column(name="id")
	private Long Id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="contactNum")
	private Long contactNum;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="status")
	private Boolean isDocVerified = false;
	
	@Column(name="DocType")
	private String DocType;
	
	
	//getters and Setters

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getContactNum() {
		return contactNum;
	}

	public void setContactNum(Long contactNum) {
		this.contactNum = contactNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Boolean getIsDocVerified() {
		return isDocVerified;
	}

	public void setIsDocVerified(Boolean isDocVerified) {
		this.isDocVerified = isDocVerified;
	}

	public String getDocType() {
		return DocType;
	}

	public void setDocType(String docType) {
		DocType = docType;
	}

	@Override
	public String toString() {
		return " User Id = " + Id + "\n FirstName = " + firstName + "\n LastName = " + lastName + "\n Contact = "
				+ contactNum + "\n City = " + city + "\n State = " + state + "\n Country = " + country + "\n Pincode = " + pincode
				+ "\n Status = " + isDocVerified + "\n Document Type = " + DocType ;
	}
	
	
	
	
}
















