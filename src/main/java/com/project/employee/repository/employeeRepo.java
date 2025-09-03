package com.project.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee.models.EmployeeMaster;

public interface employeeRepo extends JpaRepository<EmployeeMaster, Integer>{
	List<EmployeeMaster> findByDepartment(String d);
}
