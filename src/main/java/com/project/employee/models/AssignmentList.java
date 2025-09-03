package com.project.employee.models;

public class AssignmentList {

	private int assignid;
	private String name;
	private String pname;
	public int getAssignid() {
		return assignid;
	}
	public void setAssignid(int assignid) {
		this.assignid = assignid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public AssignmentList(int assignid, String name, String pname) {
		super();
		this.assignid = assignid;
		this.name = name;
		this.pname = pname;
	}
	public AssignmentList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
