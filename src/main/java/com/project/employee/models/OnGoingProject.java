package com.project.employee.models;

import java.util.ArrayList;

public class OnGoingProject {
	private String pname;
	private ArrayList<String> names;
	
	
	public OnGoingProject(String pname, ArrayList<String> names) {
		super();
		this.pname = pname;
		this.names = names;
	}
	public OnGoingProject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public ArrayList<String> getNames() {
		return names;
	}
	public void setNames(ArrayList<String> names) {
		this.names = names;
	}
	
	
}
