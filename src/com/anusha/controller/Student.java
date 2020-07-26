package com.anusha.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;



@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonIgnoreProperties({ "studentSkills" })
@JsonPropertyOrder({ "studentDOB", "student_name", "studentHobby",
		"studentMobile", "studentSkills" })
public class Student {
	@JsonProperty("student_name")
	private String studentName;
	private String studentHobby;
	private Long studentMobile;
	private Date studentDOB;
	private String studentSkills;

	public String getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(String studentSkills) {
		this.studentSkills = studentSkills;
	}

	private Address studentAddress;

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

}
