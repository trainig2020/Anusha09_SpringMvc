package com.anusha.controller;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class StudentInfoRESTAPIController {

	@RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Student> getStudentsList() {
		Student student1 = new Student();
		student1.setStudentName("The great khali");

		Student student2 = new Student();
		student2.setStudentName("The Undertaker");

		Student student3 = new Student();
		student3.setStudentName("John cene");

		ArrayList<Student> studentList = new ArrayList<Student>();

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		return studentList;

	}

	@RequestMapping(value = "/students/{name}", method = RequestMethod.GET)
	public Student getStudents(@PathVariable("name") String studentName) {
		Student student = new Student();
		student.setStudentName(studentName);
		student.setStudentHobby("ABC");

		return student;
	}

	@RequestMapping(value = "/students/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> updateStudent(
			@PathVariable("name") String studentName,
			@RequestBody Student student) {
		System.out.println("student Name:" + studentName);
		System.out.println("student Name:" + student.getStudentName()
				+ "Student Hobby:" + student.getStudentHobby());
		HttpHeaders httpheaders = new HttpHeaders();
		httpheaders.add("Key1", "value1");
		httpheaders.add("Key2", "value2");

		return new ResponseEntity<Boolean>(true, httpheaders, HttpStatus.OK);
	}

	@RequestMapping(value = "/students", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> postStudent(@RequestBody Student student) {
		System.out.println("student Name:" + student.getStudentName()
				+ "Student Hobby:" + student.getStudentHobby());
		HttpHeaders httpheaders = new HttpHeaders();
		httpheaders.add(
				"Location",
				ServletUriComponentsBuilder.fromCurrentRequest()
						.path("/{name}")
						.buildAndExpand(student.getStudentName()).toUri()
						.toString());

		return new ResponseEntity<Boolean>(true,httpheaders, HttpStatus.CREATED);

	}
	@RequestMapping(value = "/students/{name}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteStudents(@PathVariable("name") String studentName) {
		System.out.println("student Name:" + studentName);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);

		

		
	}
	

}
