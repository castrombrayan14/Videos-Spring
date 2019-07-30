package com.everis.servicioA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.servicioA.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
