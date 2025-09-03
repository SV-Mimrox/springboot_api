package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee.models.ProjectMaster;

public interface projectRepository extends JpaRepository<ProjectMaster, Integer>{

}
