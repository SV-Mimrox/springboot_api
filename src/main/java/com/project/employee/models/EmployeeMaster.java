package com.project.employee.models;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	private String name;
	private String email;
	private String department;
	private double salary;
	private LocalDate dateofjoin;
	
	
	public EmployeeMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeMaster(int empid, String name, String email, String department, double salary, LocalDate dateofjoin) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.department = department;
		this.salary = salary;
		this.dateofjoin = dateofjoin;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDateofjoin() {
		return dateofjoin;
	}
	public void setDateofjoin(LocalDate dateofjoin) {
		this.dateofjoin = dateofjoin;
	}
	
	
}
