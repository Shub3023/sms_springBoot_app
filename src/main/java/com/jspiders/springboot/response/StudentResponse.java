package com.jspiders.springboot.response;

import java.util.List;

import com.jspiders.springboot.pojo.Student;

import lombok.Data;

@Data
public class StudentResponse {
	
	private String message;
	private Student student;
	private List<Student> students;
	private int status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
