package com.jspiders.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springboot.pojo.Student;
import com.jspiders.springboot.response.StudentResponse;
import com.jspiders.springboot.service.StudnetService;

@RestController
public class StudentController {
	@Autowired
	private StudnetService studnetService;

	@PostMapping(path = "/student")
	public ResponseEntity<StudentResponse> addStudent(@RequestBody Student student) {
		Student addStudent = studnetService.addStudent(student);
		System.out.println(addStudent);
		if (addStudent != null) {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("Student added.");
			studentResponse.setStudent(addStudent);
			studentResponse.setStudents(null);
			studentResponse.setStatus(HttpStatus.CREATED.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.CREATED);
		} else {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("Student Not added.");
			studentResponse.setStudent(addStudent);
			studentResponse.setStudents(null);
			studentResponse.setStatus(HttpStatus.CREATED.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.CREATED);
		}

	}

	@GetMapping(path = "/studentid")
	public ResponseEntity<StudentResponse> findStudentById(@RequestParam long id) {

		Student student = studnetService.findStudentById(id);
		if (student != null) {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("Student Fetched By Id.");
			studentResponse.setStudent(student);
			studentResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
		} else {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("Studentq Not Found.");
			studentResponse.setStudent(student);
			studentResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
		}

	}

	@DeleteMapping(path = "/deletestudent")
	public ResponseEntity<StudentResponse> deleteStudentById(@RequestParam long id) {

		Student student = studnetService.deleteStudentById(id);
		if (student != null) {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("Student Deleted By Id.");
			studentResponse.setStudent(student);
			studentResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
		} else {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("Student Not Found.");
			studentResponse.setStudent(student);
			studentResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
		}

	}

	@PutMapping(path = "/updatestudent")
	public ResponseEntity<StudentResponse> updateStudentById(@RequestBody Student student) {

		Student updateStudent = studnetService.updateStudent(student);
		if (updateStudent != null) {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("Student Updated.");
			studentResponse.setStudent(updateStudent);
			studentResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
		} else {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("Student Not Found.");
			studentResponse.setStudent(updateStudent);
			studentResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
		}
 
	}

	@GetMapping(path = "/getAllStudent")
	public ResponseEntity<StudentResponse> getAllStudents() {

		List<Student> AllStudent = studnetService.getAllStudents();
		if (AllStudent != null) {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("All Student Fetched.");
			studentResponse.setStudent(null);
			studentResponse.setStudents(AllStudent);
			studentResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
		}
		else {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("Student Not Found.");
			studentResponse.setStudent(null);
			studentResponse.setStudents(null);
			studentResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
		}
		

	}
	
	@GetMapping(path = "/studentmobile")
	public ResponseEntity<StudentResponse> findStudentByMobile(@RequestParam long mobile) {

		Student student = studnetService.findStudentByMobile(mobile);
		if (student != null) {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("Student Fetched By Mobile.");
			studentResponse.setStudent(student);
			studentResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
		} else {
			StudentResponse studentResponse = new StudentResponse();
			studentResponse.setMessage("Student Not Found.");
			studentResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
		}

	}
}