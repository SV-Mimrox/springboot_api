package com.project.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.models.EmployeeMaster;
import com.project.employee.models.ProjectMaster;
import com.project.employee.repository.projectRepository;

@RestController
@CrossOrigin(origins = "*")
public class projectController {

	@Autowired
	private projectRepository pRepo;
	
		@PostMapping("/project_create")
		public String project_create(@RequestBody ProjectMaster pm) {
			 pRepo.save(pm);
			 return "success";
		}
		
		@GetMapping("/project_list")
		public List<ProjectMaster> list(){
			return pRepo.findAll();
	}
		
		@GetMapping("project/edit/{id}")
		public ResponseEntity<ProjectMaster> getprojectById(@PathVariable int id){
			
			return pRepo.findById(id).map(ResponseEntity::ok)
					.orElse(ResponseEntity.notFound().build());
		} 
		
		@PostMapping("/project_edit")
		public ResponseEntity<String> update(@RequestBody ProjectMaster pm){
			
			return pRepo.findById(pm.getProid()
					)
					.map(pmaster ->
					{
						pmaster.setPname(pm.getPname());
						pmaster.setCname(pm.getCname());
						pmaster.setStartdate(pm.getStartdate());
						pmaster.setEnddate(pm.getEnddate());
						pmaster.setBudget(pm.getBudget());
						pRepo.save(pm);
						return ResponseEntity.ok("updated");
					})
					.orElse(ResponseEntity.notFound().build());
					
			
		}
		
		
		@PostMapping("/project_delete")
		public String deleteproject(@RequestBody ProjectMaster pm ) {
			
			pRepo.deleteById(pm.getProid());
			
			return"success";
		}
}
