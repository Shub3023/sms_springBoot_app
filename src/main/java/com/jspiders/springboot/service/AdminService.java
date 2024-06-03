package com.jspiders.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springboot.pojo.Admin;
import com.jspiders.springboot.repository.AdminRepo;

@Service
public class AdminService {
    
	@Autowired
	private AdminRepo adminRepo;
	
	public Admin addAdmin(Admin admin) {
		adminRepo.save(admin);
		return admin;
	}

}
