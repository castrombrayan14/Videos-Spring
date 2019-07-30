package com.everis.servicioA.service;

import java.util.List;

import com.everis.servicioA.entity.Classes;

public interface ClassesService {

	Classes saveClasses(Classes classes);
	
	 List<Classes> listClasses();
	 
	 Classes findClasses(int id);
}
