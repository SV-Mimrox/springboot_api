package com.project.employee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.models.AssignmentList;
import com.project.employee.models.AssignmentMaster;
import com.project.employee.models.EmployeeMaster;
import com.project.employee.models.OnGoingProject;
import com.project.employee.models.ProjectMaster;
import com.project.employee.repository.AssignmentRepository;
import com.project.employee.repository.employeeRepo;
import com.project.employee.repository.projectRepository;

@RestController
@CrossOrigin(origins = "*")
public class AssignmentController {

	@Autowired
	private AssignmentRepository assignRepo;
	@Autowired
	private employeeRepo empRepo;
	@Autowired
	private projectRepository proRepo;
	
	@PostMapping("/assignment_create")
	public String create(@RequestBody AssignmentMaster assMaster) {
	assignRepo.save(assMaster);
		return "success";
	}
	
	
	@GetMapping("/assignment_list")
	public List<AssignmentList> list(){
		ArrayList<AssignmentList> al = new ArrayList<AssignmentList>();
		List<AssignmentMaster> all = assignRepo.findAll();
		for (AssignmentMaster adata : all) {
			Optional<EmployeeMaster> emp = empRepo.findById(adata.getEmpid());
			Optional<ProjectMaster> prj = proRepo.findById(adata.getProid());
			String name="";
			String pname="";
			if(!emp.isEmpty())
			{
				EmployeeMaster empData = emp.get();	
				name=empData.getName();
			}
			if(!prj.isEmpty())
			{
				ProjectMaster prData = prj.get();
				pname=prData.getPname();
			}
			AssignmentList a  = new AssignmentList(adata.getAssignid(), name, pname);
			al.add(a);
		}
		return al;
		
	}
	
	@PostMapping("/assignment_delete")
	public String deleteAssignment(@RequestBody AssignmentMaster assMaster ) {
		
		assignRepo.deleteById(assMaster.getAssignid());
		
		return"success";
	}
	
	
	
}
