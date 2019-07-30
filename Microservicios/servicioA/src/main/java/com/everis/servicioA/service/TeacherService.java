package com.everis.servicioA.service;

import java.util.List;

import com.everis.servicioA.entity.Teacher;

public interface TeacherService {

	Teacher saveTeacher(Teacher teacher);
	
	//Listar Clases
	public List<Teacher> listTeacher();
	
	public Teacher findByTeacherId(int id);
	
	//Borrar clases
	public void deleteTeacher(int id);
}
