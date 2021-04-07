package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
	@Id
	private String emailId;
	private String firstName;
	private String lastName;

	private Integer employeeId;
	private Date dateOfBirth;
	
	private String locationId;

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(String emailId, String firstName, String lastName, Integer employeeId, Date dateOfBirth,
			String locationId) {
		super();
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.dateOfBirth = dateOfBirth;
		this.locationId = locationId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "Profile [emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName + ", employeeId="
				+ employeeId + ", dateOfBirth=" + dateOfBirth + ", locationId=" + locationId + "]";
	}
	
	
	
	
	

}
