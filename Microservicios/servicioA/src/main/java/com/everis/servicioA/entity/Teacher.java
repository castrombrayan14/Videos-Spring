package com.everis.servicioA.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
public class Teacher implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="Ingresar datos")
	private int teacherId;
	@NotNull(message="Ingresar datos")
	private String gender;
	@NotNull(message="Ingresar su nombre")
	private String firstName;
	@NotNull(message="Ingresar datos")
	private String midleName;
	@NotNull(message="Ingresar datos")
	private String lastName;
	@NotNull(message="Ingresar datos")
	private String otherTeacherDetails;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="teacher",orphanRemoval = true)
	private List<Classes> classes = new ArrayList<Classes>();
	
}
