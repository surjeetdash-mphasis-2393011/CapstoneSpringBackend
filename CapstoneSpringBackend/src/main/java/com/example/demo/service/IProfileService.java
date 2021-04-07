package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Profile;

public interface IProfileService {

	
	List<Profile> getall();
	void insert(Profile profile);
	
	Profile findbyId(String email);
	
	Profile update(Profile profile);
	

	void delete(Profile profile);
	
}
