package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Profile;
import com.example.demo.model.Projects;
import com.example.demo.repository.ProjectsRepository;

@Component
public class ProjectsService implements IProjectsService {
   
	@Autowired
	ProjectsRepository prores;

	@Override
	public Projects updateProjet(Projects project) {
		
		return prores.save(project);
	}

	@Override
	public List<Projects> getAllProjects() {
		// TODO Auto-generated method stub
		return prores.findAll();
	}

	@Override
	public Projects createProjet(Projects project) {
		// TODO Auto-generated method stub
		return prores.save(project);
	}

	@Override
	public void deleteproject(Projects project) {
		
	     prores.delete(project);
	}

	@Override
	public List<Projects> getByEmailId(String email) {
		
		return prores.getByEmailId(email);
	}
	  
	@Override
	public  Projects getOneProjects(Integer id) {
		
		return prores.getOne(id);
	}
	

}
