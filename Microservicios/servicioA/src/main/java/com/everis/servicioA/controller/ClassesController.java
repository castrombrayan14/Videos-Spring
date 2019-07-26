package com.everis.servicioA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	ClassesService classesService;
	
	@GetMapping("/listClasses")
	public List<Classes> listClass() {
		
		return classesService.listClasses();
	}	
	
	@PostMapping("/saveClasses")
	public Classes saveClasses(@RequestBody Classes classes) {
		
		return classesService.saveClasses(classes);
	}
	
	@GetMapping("/listClasses/{id}")
	public Classes show(@PathVariable int id) throws Exception {

		return classesService.findByClassId(id);
		
		
	}

	@DeleteMapping("/deleteClasses/{id}")
	public void delete(@PathVariable int id) {
		classesService.deleteClasses(id);
		
	}

}
