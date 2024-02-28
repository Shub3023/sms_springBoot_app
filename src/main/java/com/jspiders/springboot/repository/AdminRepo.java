package com.jspiders.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.springboot.pojo.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {
	
	
	

}
