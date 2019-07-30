package com.everis.servicioA.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Teacher implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="Ingresar datos")
	private int teacherId;
	@NotNull(message="Ingresar el sexo correspondiente")
	private String gender;
	@NotNull(message="Ingresar su primer nombre")
	private String firstName;
	@NotNull(message="Ingresar datos")
	private String midleName;
	@NotNull(message="Ingresar su apellido")
	private String lastName;
	@NotNull(message="Ingresar datos")
	private String otherTeacherDetails;
	@ManyToOne(cascade = CascadeType.ALL )	
	@JoinColumn(name="teacher_id" , referencedColumnName = "teacherId")
	private List<Classes> classes= new ArrayList<>();

}
