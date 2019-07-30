package com.everis.proyect.service;

import java.util.List;

import com.everis.proyect.entity.Student;

public interface StudentService {

	public void saveStudents(Student student);
	
	public List<Student> listStudent();

	public Student findByStudentIdSQL(int id);
	
	void deleteStudent(int id);
}
