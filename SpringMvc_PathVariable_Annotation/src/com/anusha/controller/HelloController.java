package com.anusha.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome/{countryName}/{userName}")
	
/*	public ModelAndView helloWorld(@PathVariable("userName") String name ,@PathVariable("countryName") String country) {
*/		
	
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars) {

	
		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");


		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Hello!!" + name + "You are from " +country);
		return modelandview;
	}

}