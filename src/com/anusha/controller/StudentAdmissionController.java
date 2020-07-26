package com.anusha.controller;

import jakarta.validation.Valid;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] { "studentMobile" });
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, "studentDOB",
				new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName",
				new StudentNameEditor());
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getAdmistrationForm() throws Exception {

		String exceptionOccured = "NULL_POINTER";
		if (exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("Null Pointer Exception");
		} else if (exceptionOccured.equalsIgnoreCase("ARITHMETIC_EXCEPTION")) {
			throw new ArithmeticException("Arithmatic Exception");
		}

		ModelAndView model = new ModelAndView("AdmissionForm");

		return model;
	}

	@ModelAttribute
	public void addingCommomObjects(Model model) {
		model.addAttribute("headermessage", "GVR College of Engineering,India");

	}

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	// public ModelAndView submitAdmissionForm(@ModelAttribute("student1")
	// Student student1) {
	public ModelAndView submitAdmissionForm(
			@Valid @ModelAttribute("student1") Student student1,
			BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView model1 = new ModelAndView("AdmissionForm");

			return model1;

		}
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");

		return model1;
	}

	
}
