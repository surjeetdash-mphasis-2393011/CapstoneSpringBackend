package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Projects;
import com.example.demo.service.IProjectsService;


@RestController
@CrossOrigin
@RequestMapping("/projects")
public class ProjectsController {
 
	@Autowired
	  IProjectsService ps;
	 
	@GetMapping("")
	public List<Projects> getallprojects(){
		return ps.getAllProjects() ;
		
	}
	
	@GetMapping("/getByEmail/{id}")
	public List<Projects> getbyid(@PathVariable("id") String id){
		return ps.getByEmailId(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteprojects(@PathVariable("id") Integer id) {
		
		Projects project = ps.getOneProjects(id);
		ps.deleteproject(project);
	}
	
	@PostMapping("/post")
	public Projects createProjects(@RequestBody Projects project) {
		
		return ps.createProjet(project);
	}
	
	@PutMapping("/update")
	public Projects update(@RequestBody Projects project) {
		
		return ps.updateProjet(project);
	}
	
	
}
