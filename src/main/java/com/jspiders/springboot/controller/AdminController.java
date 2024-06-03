package com.jspiders.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springboot.pojo.Admin;
import com.jspiders.springboot.pojo.Student;
import com.jspiders.springboot.response.AdminResponse;
import com.jspiders.springboot.response.StudentResponse;
import com.jspiders.springboot.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping(path = "/admin")
	public ResponseEntity<AdminResponse> addAdmin(@RequestBody Admin admin) {
		Admin addAdmin = adminService.addAdmin(admin);
		
		System.out.println(addAdmin);
		if (addAdmin != null) {
			AdminResponse admin1 = new AdminResponse();
			admin1.setMessage("Admin Added.");
			admin1.setAdmin(addAdmin);
			admin1.setAdmins(null);
			return new ResponseEntity<AdminResponse>(admin1, HttpStatus.CREATED);
		} else {
			AdminResponse admin1 = new AdminResponse();
			admin1.setMessage("Admin Not Added.");
			admin1.setAdmin(addAdmin);
			admin1.setAdmins(null);
			return new ResponseEntity<AdminResponse>(admin1, HttpStatus.NOT_FOUND);
		}

}
} 