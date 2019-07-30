package com.everis.servicioA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.servicioA.entity.Teacher;
import com.everis.servicioA.service.TeacherService;



@RestController
@RequestMapping
public class TeacherController {
	

	@Autowired
	TeacherService teacherService;
	
	@GetMapping("/listTeacher")
	public List<Teacher> listTeacher() {
		
		return teacherService.listTeacher();
	}
	
	@GetMapping("/listTeacher/{id}")
	public Teacher findIdTeacher(int id) {
		
		return teacherService.findByIdTeacher(id);
	}

}
