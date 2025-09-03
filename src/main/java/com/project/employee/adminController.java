package com.project.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.models.AdminLogin;
import com.project.employee.models.AdminRegistrationMaster;
import com.project.employee.repository.AdminRepository;

@RestController
@CrossOrigin(origins = "*")
public class adminController {

		@Autowired
		private AdminRepository adRepo;
		
		@PostMapping("/admin_registration")
		public AdminRegistrationMaster signup(@RequestBody AdminRegistrationMaster adm) {
			return adRepo.save(adm);
		}
		
		@PostMapping("/admin_login")
		public String login(@RequestBody AdminLogin adm) {
			AdminRegistrationMaster byEmailAndPassword = adRepo.findByEmailAndPassword(adm.getEmail(),adm.getPassword());
			if(byEmailAndPassword != null) {
				return "success";
			}
			else {
				return "fail";
			}
		}
}
