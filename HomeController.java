package com.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.task1.Serives.ProjectService;
import com.task1.dto.Projectdto;
@Controller
public class HomeController {
    @Autowired
    private ProjectService projectService;

	@GetMapping("/home")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
		
	}

}