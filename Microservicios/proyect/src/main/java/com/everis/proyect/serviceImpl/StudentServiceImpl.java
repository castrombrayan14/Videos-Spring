package com.everis.proyect.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.proyect.entity.Student;
import com.everis.proyect.repository.StudentRepository;
import com.everis.proyect.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	

	@Override
	@Transactional
	public void saveStudents(Student student) {

		studentRepository.save(student);
	}

	@Override
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Student findByStudentIdSQL(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findByStudentIdSQL(id);
	}

}
