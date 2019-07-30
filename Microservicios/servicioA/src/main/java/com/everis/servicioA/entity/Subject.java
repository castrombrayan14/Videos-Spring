package com.everis.servicioA.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Subject implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="Ingresar datos")
	private int subjectId;
	@NotNull(message="Ingresar datos")
	private String subjectName;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="subject")
	private List<Classes> classes;

}
