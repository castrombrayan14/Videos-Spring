package com.everis.servicioA.service;

import java.util.List;

import com.everis.servicioA.entity.Subject;

public interface SubjectService {

	Subject saveSubject(Subject subject);
	
     List<Subject> listSubject();
	
     Subject findByIdSubject(int id);
}
