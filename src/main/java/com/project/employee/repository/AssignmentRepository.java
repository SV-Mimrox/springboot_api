package com.project.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee.models.AssignmentMaster;

public interface AssignmentRepository extends JpaRepository<AssignmentMaster, Integer>{

	List<AssignmentMaster> findByProid(int id);
}
