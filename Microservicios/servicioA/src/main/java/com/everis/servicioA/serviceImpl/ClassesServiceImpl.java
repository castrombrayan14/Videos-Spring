package com.everis.servicioA.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.servicioA.entity.Classes;
import com.everis.servicioA.repository.ClassesRepository;
import com.everis.servicioA.repository.ClassesStudentRepository;
import com.everis.servicioA.service.ClassesService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClassesServiceImpl implements ClassesService{

	@Autowired
	private ClassesRepository classesRepository;
	
	@Autowired
	private ClassesStudentRepository classesStudentRepository;
	
	@Transactional
	@Override
	public Classes saveClasses(Classes clas) {

		Classes room = classesRepository.save(clas);
		
		clas.getClassesStudent().forEach(StudentClasses -> StudentClasses.setClassesReference(room));
		
		classesStudentRepository.saveAll(clas.getClassesStudent());
		return room;
	}

	
	
}
