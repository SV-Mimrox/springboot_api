package com.project.employee.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProjectMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proid;
	private String pname;
	private String cname;
	private LocalDate startdate;
	private LocalDate enddate;
	private double budget;
	
	
	
	
	
	public ProjectMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjectMaster(int proid, String pname, String cname, LocalDate startdate, LocalDate enddate, double budget) {
		super();
		this.proid = proid;
		this.pname = pname;
		this.cname = cname;
		this.startdate = startdate;
		this.enddate = enddate;
		this.budget = budget;
	}
	
	
	
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	public LocalDate getEnddate() {
		return enddate;
	}
	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	
	
	
	
}
