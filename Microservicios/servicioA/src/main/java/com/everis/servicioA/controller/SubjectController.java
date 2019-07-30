package com.everis.servicioA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.servicioA.entity.Subject;
import com.everis.servicioA.service.SubjectService;

@RestController
@RequestMapping
public class SubjectController {


	@Autowired
	SubjectService subjectService;
	
	@GetMapping("/listSubject")
	public List<Subject> listSubject() {
		
		return subjectService.listSubject();
	}
	
	@GetMapping("/listSubject/{id}")
	public Subject findIdSubject(@PathVariable int id) {
		
		return subjectService.findByIdSubject(id);
	}
	
}
