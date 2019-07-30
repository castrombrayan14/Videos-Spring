package com.everis.servicioA.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.servicioA.entity.Teacher;
import com.everis.servicioA.repository.ClassesRepository;
import com.everis.servicioA.repository.ClassesStudentRepository;
import com.everis.servicioA.repository.TeacherRepository;
import com.everis.servicioA.service.TeacherService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	TeacherRepository teacherRepository;

	@Override
	public Teacher saveTeacher(Teacher teacher) {

		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> listTeacher() {

		return teacherRepository.findAll();
	}

}
