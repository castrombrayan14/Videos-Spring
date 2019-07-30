package com.everis.servicioA.service;

import java.util.List;

import com.everis.servicioA.entity.Subject;

public interface SubjectService {

	Subject saveSubject(Subject subject);
	
	public List<Subject> listSubject();
}
