package com.everis.servicioA.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.servicioA.entity.ClassesStudent;
import com.everis.servicioA.repository.ClassesRepository;
import com.everis.servicioA.repository.ClassesStudentRepository;
import com.everis.servicioA.service.ClassesStudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClassesStudentServiceImpl implements ClassesStudentService {

	@Autowired
	ClassesStudentRepository classesStudentRepository;

	
	@Override
	public ClassesStudent saveClassesStudent(ClassesStudent classesStudent) {
		// TODO Auto-generated method stub
		return classesStudentRepository.save(classesStudent);
	}

}
