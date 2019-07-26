package com.everis.servicioA.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.servicioA.entity.ClassesStudent;
import com.everis.servicioA.feignService.StudentFeignService;
import com.everis.servicioA.repository.ClassesStudentRepository;
import com.everis.servicioA.service.ClassesStudentService;

public class ClassesStudentServiceImpl implements ClassesStudentService {

	@Autowired
	ClassesStudentRepository classesStudentRepository;

	@Autowired
	private StudentFeignService feign;
	
	@Override
	public ClassesStudent saveClassesStudent(ClassesStudent classesStudent) {
		// TODO Auto-generated method stub
		return classesStudentRepository.save(classesStudent);
	}

	
}
