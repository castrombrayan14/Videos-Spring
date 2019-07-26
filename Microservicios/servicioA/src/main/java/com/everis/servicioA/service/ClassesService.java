package com.everis.servicioA.service;

import java.util.List;

import com.everis.servicioA.entity.Classes;

public interface ClassesService {

	//Guardar clases
	Classes saveClasses(Classes classes);
	
	//Listar Clases
	public List<Classes> listClasses();
	
	public Classes findByClassId(int id);
	
	//Borrar clases
	public void deleteClasses(int id);
}
