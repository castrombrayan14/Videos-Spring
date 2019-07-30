package com.everis.servicioA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.servicioA.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
