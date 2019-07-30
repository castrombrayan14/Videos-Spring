package com.everis.servicioA.service;

import java.util.List;

import com.everis.servicioA.entity.Teacher;

public interface TeacherService {

    Teacher saveTeacher(Teacher teacher);
	
	public List<Teacher> listTeacher();
}
