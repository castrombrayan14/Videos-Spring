package com.everis.proyect.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private int studentId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="middle_name")
	private String middleName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="date_of_birth")
	private String dateOfBirth;
	@Column(name="other_student_details")
	private String otherStudentDetails;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getOtherStudentDetails() {
		return otherStudentDetails;
	}
	public void setOtherStudentDetails(String otherStudentDetails) {
		this.otherStudentDetails = otherStudentDetails;
	}
	public Student() {
	}
	public Student(int studentId, String firstName, String middleName, String lastName, String dateOfBirth,
			String otherStudentDetails) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.otherStudentDetails = otherStudentDetails;
	}
	
	
	
}	
	