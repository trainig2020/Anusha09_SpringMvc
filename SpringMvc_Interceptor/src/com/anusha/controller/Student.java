package com.anusha.controller;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import com.anusha.controller.IsValidHobby;

import java.util.Date;

public class Student {
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	@Size(min = 2, max=30) @IsValidHobby(listOfValidHobbies="Music|Football|Cricket|Hockey")
	private String studentHobby;
	@Max(2222)
	private Long studentMobile;
	@Past
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
