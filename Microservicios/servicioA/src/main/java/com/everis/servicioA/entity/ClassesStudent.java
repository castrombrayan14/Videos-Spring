package com.everis.servicioA.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
@Data
@Entity
public class ClassesStudent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classesStudentId;
	
	private int studentId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("classesStudent")
	private Classes classesReference;
	
}
