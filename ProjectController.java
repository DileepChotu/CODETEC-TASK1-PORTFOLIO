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
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public String viewProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "project";
    }

    @PostMapping("/projects")
    public String addProject(@ModelAttribute Projectdto projectdto) {
        projectService.saveProject(projectdto);
        return "redirect:/projects";
    }
}