package com.project.employee.models;

public class DepartmentViseEmployee {
	public String department;
	public int totalEmp;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getTotalEmp() {
		return totalEmp;
	}
	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}
	public DepartmentViseEmployee(String department, int totalEmp) {
		super();
		this.department = department;
		this.totalEmp = totalEmp;
	}
	public DepartmentViseEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
