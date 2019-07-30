package com.everis.proyect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.proyect.entity.Student;
import com.everis.proyect.serviceImpl.StudentServiceImpl;

@RestController
@RequestMapping
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@GetMapping("/liststudents")
	public List<Student> listStudent() {
		
		return studentServiceImpl.listStudent();
	}
	
	
	@PostMapping("/saveStudent")
	public void saveStudent(@RequestBody Student student) {
		
		studentServiceImpl.saveStudents(student);
		
	}
	
	@GetMapping("/liststudents/{id}")
	public Student findStudent(@PathVariable int id) {
		
		return studentServiceImpl.findByStudentIdSQL(id);
		
	}
	
	
}
