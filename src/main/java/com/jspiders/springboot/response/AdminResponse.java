package com.jspiders.springboot.response;

import java.util.List;

import com.jspiders.springboot.pojo.Admin;

import lombok.Data;


public class AdminResponse {
	
	private String message;
	private Admin admin;
	private List<Admin> admins;
	private int status;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public List<Admin> getAdmins() {
		return admins;
	}
	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}
	@Override
	public String toString() {
		return "AdminResponse [message=" + message + ", admin=" + admin + ", admins=" + admins + ", status=" + status
				+ "]";
	}
	


}
