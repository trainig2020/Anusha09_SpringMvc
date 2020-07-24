package com.anusha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView modelandview = new ModelAndView("AdmissionForm");
		return modelandview;
	}

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby) {
		ModelAndView modelandview1 = new ModelAndView("AdmissionSuccess");
		modelandview1.addObject("msg", "Details submitted by you :: Name: "+name+ " ,Hobby: " +hobby);
	  return modelandview1;
	}

}

