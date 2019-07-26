package com.everis.proyect.service;

import java.util.List;

import com.everis.proyect.entity.Student;

public interface StudentService {

	 Student saveStudents(Student student);
	
	List<Student> listStudent();

	Student findByStudentIdSQL(int id);
	
	public void deleteStudent(int id);
}
