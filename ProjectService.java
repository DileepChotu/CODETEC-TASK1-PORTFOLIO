package com.task1.Serives;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task1.Entity.Project;
import com.task1.Repostry.ProjectRepository;
import com.task1.dto.Projectdto;

//ProjectService.java
@Service
public class ProjectService {
 @Autowired
 private ProjectRepository projectRepository;

 public List<Project> getAllProjects() {
     return projectRepository.findAll();
 }

 public void saveProject(Projectdto projectdto) {
	 Project obj= new Project();
	 obj.setId(projectdto.getId());
	 obj.setTitle(projectdto.getTitle());
	 obj.setDescription(projectdto.getDescription());
	 obj.setUrl(projectdto.getUrl());
     projectRepository.save(obj);
 }
}