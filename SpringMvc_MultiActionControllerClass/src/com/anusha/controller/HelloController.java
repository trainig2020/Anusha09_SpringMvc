package com.anusha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/greet")
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Hello world!!");
		return modelandview;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld() {

		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "hi world!!");
		return modelandview;
	}

	

}
