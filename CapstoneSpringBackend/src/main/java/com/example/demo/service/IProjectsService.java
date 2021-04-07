package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Projects;

public interface IProjectsService {

	
	public Projects updateProjet(Projects project);
	public List<Projects> getAllProjects();
	public Projects createProjet(Projects project);
	public void deleteproject(Projects project);
	public List<Projects> getByEmailId( String email);
	public Projects getOneProjects(Integer id);
	
}
