package com.project.employee.models;

public class DepartmentviseSalary {

	private String department;
	private int salary;
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public DepartmentviseSalary(String department, int salary) {
		super();
		this.department = department;
		this.salary = salary;
	}
	public DepartmentviseSalary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
