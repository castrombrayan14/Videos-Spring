package com.everis.servicioA.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.servicioA.entity.Subject;
import com.everis.servicioA.repository.ClassesRepository;
import com.everis.servicioA.repository.ClassesStudentRepository;
import com.everis.servicioA.repository.SubjectRepository;
import com.everis.servicioA.service.SubjectService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class SubjectServiceImpl implements SubjectService{
	
	@Autowired
	SubjectRepository subjectRepository;

	@Override
	public Subject saveSubject(Subject subject) {

		return subjectRepository.save(subject);
	}

	@Override
	public List<Subject> listSubject() {

		return subjectRepository.findAll();
	}

	@Override
	public Subject findByIdSubject(int id) {
		// TODO Auto-generated method stub
		return subjectRepository.findById(id).get();
	}

}
