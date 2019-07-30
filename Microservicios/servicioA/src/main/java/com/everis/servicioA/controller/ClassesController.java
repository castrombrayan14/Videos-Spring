package com.everis.servicioA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.servicioA.entity.Classes;
import com.everis.servicioA.service.ClassesService;
import com.everis.servicioA.serviceImpl.ClassesServiceImpl;

@RestController
@RequestMapping
public class ClassesController {
	
	@Autowired
	ClassesService classesServiceImpl;
	
	@GetMapping("/listClass")
	public List<Classes> listClasses() {
		
		return classesServiceImpl.listClasses();
	}
	
	@GetMapping("/listClass/{id}")
	public Classes findClasses(@PathVariable int id) {
		
		return classesServiceImpl.findClasses(id);
		
	}
	
	@PostMapping("/saveClasses")
	public Classes saveClasses(@RequestBody Classes classes) {
		
		return classesServiceImpl.saveClasses(classes);
	}
}
