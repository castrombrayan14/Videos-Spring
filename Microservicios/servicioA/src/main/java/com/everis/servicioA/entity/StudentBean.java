package com.everis.servicioA.entity;

import java.io.Serializable;

public class StudentBean implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private int studentId;

	private String firstName;

	private String middleName;
	
	private String lastName;
	
	private String dateOfBirth;
	
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
	public StudentBean() {
	}
	public StudentBean(int studentId, String firstName, String middleName, String lastName, String dateOfBirth,
			String otherStudentDetails) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.otherStudentDetails = otherStudentDetails;
	}
	
	
	
}	
	