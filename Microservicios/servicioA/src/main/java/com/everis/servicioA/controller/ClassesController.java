package com.everis.servicioA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.servicioA.entity.Classes;
import com.everis.servicioA.serviceImpl.ClassesServiceImpl;

@RestController
@RequestMapping
public class ClassesController {
	
	@Autowired
	ClassesServiceImpl classesServiceImpl;
	
	@PostMapping("/saveClasses")
	public Classes saveClasses(@RequestBody Classes classes) {
		
		return classesServiceImpl.saveClasses(classes);
	}
}
