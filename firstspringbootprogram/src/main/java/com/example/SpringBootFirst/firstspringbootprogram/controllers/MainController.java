package com.example.SpringBootFirst.firstspringbootprogram.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		ModelAndView mv=null;
		mv=new ModelAndView("hello") ;  
		mv.addObject("msg","Hello first spring mvc boot program");
		return mv;
	}
}
