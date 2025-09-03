package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee.models.AdminRegistrationMaster;

public interface AdminRepository extends JpaRepository<AdminRegistrationMaster, Integer>{
	AdminRegistrationMaster findByEmailAndPassword(String e,String p);
}
