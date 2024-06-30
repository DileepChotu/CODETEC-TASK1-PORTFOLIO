package com.task1.Repostry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task1.Entity.Project;
import com.task1.dto.Projectdto;

//ProjectRepository.java
public interface ProjectRepository extends JpaRepository<Project, Long> {

	 

	
	}
