package com.project.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.models.AssignmentMaster;
import com.project.employee.models.DepartmentViseEmployee;
import com.project.employee.models.DepartmentviseSalary;
import com.project.employee.models.EmployeeMaster;
import com.project.employee.models.OnGoingProject;
import com.project.employee.models.ProjectMaster;
import com.project.employee.repository.AssignmentRepository;
import com.project.employee.repository.employeeRepo;
import com.project.employee.repository.projectRepository;


@RestController
@CrossOrigin(origins = "*")
public class ReportController {
	
	@Autowired
	private employeeRepo empRepo;
	
	@Autowired
	private projectRepository proRepo;
	
	@Autowired
	private AssignmentRepository assignRepo;
	
	@GetMapping("/employee_report")
	public ArrayList<DepartmentViseEmployee> getEmployeeReport() {
		ArrayList<String> dep= new ArrayList<String>();
		ArrayList<DepartmentViseEmployee> de = new ArrayList<DepartmentViseEmployee>();
		dep.add("it tech");
		dep.add("angular");
		dep.add("Java Developer");
		dep.add("UI/UX Developer");
		dep.add("Mobile Application");
		for (String d : dep) {
			List<EmployeeMaster> byDepartment = empRepo.findByDepartment(d);
			DepartmentViseEmployee dve = new DepartmentViseEmployee(d, byDepartment.size());
			de.add(dve);
		}
		return de;
		
	}
	
	@GetMapping("/total_salary")
	public ArrayList<DepartmentviseSalary> getTotalSalary() {
	    ArrayList<String> dep = new ArrayList<>();
	    ArrayList<DepartmentviseSalary> des = new ArrayList<>();

	    
	    dep.add("it tech");
		dep.add("angular");
		dep.add("Java Developer");
		dep.add("UI/UX Developer");
		dep.add("Mobile Application");

	    for (String d : dep) {
	        
	        List<EmployeeMaster> byDepartment = empRepo.findByDepartment(d);

	        int totalSalary = 0;
	        for (EmployeeMaster e : byDepartment) {
	            totalSalary += e.getSalary(); 
	        }

	        DepartmentviseSalary dvs = new DepartmentviseSalary(d, totalSalary);
	        des.add(dvs);
	    }

	    return des;
	}
	
	
	@GetMapping("/assignment_report")
	public ArrayList<OnGoingProject> ongoingProject(){
		List<ProjectMaster> allPrj = proRepo.findAll();
		ArrayList<OnGoingProject> response= new ArrayList<OnGoingProject>();
		for (ProjectMaster prjData : allPrj) {
			OnGoingProject ogp = new OnGoingProject();
			ogp.setPname(prjData.getPname());
			ArrayList<String> emps = new ArrayList<String>();
			List<AssignmentMaster> byProid = assignRepo.findByProid(prjData.getProid());
			for (AssignmentMaster asm : byProid) {
				Optional<EmployeeMaster> byId = empRepo.findById(asm.getEmpid());
				if(!byId.isEmpty())
				{
					EmployeeMaster empData = byId.get();
					emps.add(empData.getName());
				}
			}
			ogp.setNames(emps);
			response.add(ogp);
		}
		return response;
	}
}
