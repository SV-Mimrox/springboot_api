package com.project.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.models.DepartmentViseEmployee;
import com.project.employee.models.EmployeeMaster;
import com.project.employee.repository.employeeRepo;

@RestController
@CrossOrigin(origins="*")
public class employeeController {

    private final ProjectManagementSystemApplication projectManagementSystemApplication;

	@Autowired
	private employeeRepo empRepo;


    employeeController(ProjectManagementSystemApplication projectManagementSystemApplication) {
        this.projectManagementSystemApplication = projectManagementSystemApplication;
    }
	
	
	
	@PostMapping("/employee_create")
	public String create(@RequestBody EmployeeMaster empMaster) {
		empRepo.save(empMaster);
		return "success";
	}
	
	@GetMapping("/employee_list")
	public List<EmployeeMaster> list(){
		return empRepo.findAll();
		
	}
	
	@GetMapping("edit/{id}")
	public ResponseEntity<EmployeeMaster> getEmpById(@PathVariable int id){
		
		return empRepo.findById(id).map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	} 
	
	@PostMapping("/employee_edit")
	public ResponseEntity<String> update(@RequestBody EmployeeMaster empmaster){
		
		return empRepo.findById(empmaster.getEmpid())
				.map(emp ->
				{
					emp.setName(empmaster.getName());
					emp.setEmail(empmaster.getEmail());
					emp.setDepartment(empmaster.getDepartment());
					emp.setSalary(empmaster.getSalary());
					emp.setDateofjoin(empmaster.getDateofjoin());
					empRepo.save(emp);
					return ResponseEntity.ok("updated");
				})
				.orElse(ResponseEntity.notFound().build());
				
		
	}
	
	
	@PostMapping("/delete")
	public String deleteemployee(@RequestBody EmployeeMaster empMaster ) {
		
		empRepo.deleteById(empMaster.getEmpid());
		
		return"success";
	}
	
	
}
