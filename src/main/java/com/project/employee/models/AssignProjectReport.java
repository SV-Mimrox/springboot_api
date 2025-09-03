package com.project.employee.models;

public class AssignProjectReport {

	private String pname;
	private String name;
	public AssignProjectReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssignProjectReport(String pname, String name) {
		super();
		this.pname = pname;
		this.name = name;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
