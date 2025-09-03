package com.project.employee.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AssignmentMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int assignid;
	private int empid;
	private int proid;
	
	
	
	
	public AssignmentMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssignmentMaster(int assignid, int empid, int proid) {
		super();
		this.assignid = assignid;
		this.empid = empid;
		this.proid = proid;
	}
	public int getAssignid() {
		return assignid;
	}
	public void setAssignid(int assignid) {
		this.assignid = assignid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	
	
	
	
}
