package com.jspiders.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springboot.pojo.Student;
import com.jspiders.springboot.repository.StudentRepo;

@Service
public class StudnetService { 
    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }
 
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student findStudentById(long id) {
        Optional<Student> optional = studentRepo.findById(id);
        return optional.orElse(null);
    }

    public Student deleteStudentById(long id) {
        Student student = findStudentById(id);
        if (student != null) {
            studentRepo.deleteById(id);
        }
        return student;
    }

    public Student updateStudent(Student student) {
    	
        return studentRepo.save(student);
    }

    public Student findStudentByMobile(long mobile) {
        return studentRepo.getByMobile(mobile);
    }
}
