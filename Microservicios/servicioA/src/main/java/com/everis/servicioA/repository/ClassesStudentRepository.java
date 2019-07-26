package com.everis.servicioA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.servicioA.entity.ClassesStudent;

@Repository
public interface ClassesStudentRepository extends JpaRepository<ClassesStudent, Integer> {

}
