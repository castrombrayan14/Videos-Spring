package com.everis.servicioA.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.servicioA.entity.Classes;
import com.everis.servicioA.repository.ClassesRepository;
import com.everis.servicioA.repository.ClassesStudentRepository;
import com.everis.servicioA.service.ClassesService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class ClassesServiceImpl implements ClassesService{

	@Autowired
	private ClassesRepository classesRepository;
	
	@Autowired
	private ClassesStudentRepository classesStudentRepository;
	
	//Guardar una clases con uno o mas estudiantes
	
	@Override
	@Transactional
	public Classes saveClasses(Classes clas) {

		Classes room = classesRepository.save(clas);
		
		clas.getClassesStudent().forEach(StudentClasses -> StudentClasses.setClassesReference(room));
		
		classesStudentRepository.saveAll(clas.getClassesStudent());
		
		log.debug("Se añade la Clase " + clas);
		
		return room;
	}

	//Listar clases
	@Override
	public List<Classes> listClasses() {

		log.debug("Se obtienen todas las clase");

		return classesRepository.findAll();
	}

	//Borrar clase ingresando un id
	@Override
	@Transactional
	public void deleteClasses(int id) {

		log.debug("Se elimina la clase con id:" + id);
		
		classesRepository.deleteById(id);
		
	}

	@Override
	public Classes findByClassId(int id) {

		log.debug("Se obtiene la clase con id:" + id);
		
		return classesRepository.findById(id).orElse(null);
	}

	
	
}
