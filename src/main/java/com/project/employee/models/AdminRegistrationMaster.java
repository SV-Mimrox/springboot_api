package com.project.employee.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdminRegistrationMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int admid;
	private String name;
	private String email;
	private String contact;
	private String password;
	
	
	
	public AdminRegistrationMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminRegistrationMaster(int admid, String name, String email, String contact, String password) {
		super();
		this.admid = admid;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.password = password;
	}
	public int getAdmid() {
		return admid;
	}
	public void setAdmid(int admid) {
		this.admid = admid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
