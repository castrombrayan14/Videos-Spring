package com.everis.servicioA.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
public class Classes implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="Ingresar datos")
	private int classId;
	@NotNull(message="Ingresar Codigo de clase")
	private String classCode;
	@NotNull(message="Ingresar el nombre de la clase")
	private String className;
	@NotNull(message="Ingresar datos")
	private String dateFrom;
	@NotNull(message="Ingresar datos")
	private String dateTo;
    @ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnoreProperties("classes")
    private Teacher teacher;
    @ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnoreProperties("classe")
    private Subject subject;

	
	@OneToMany(mappedBy="classesReference")
	@JsonIgnoreProperties("classesReference")
	public List<ClassesStudent> classesStudent = new ArrayList<ClassesStudent>();
	
	
	
}
