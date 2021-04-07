package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Profile;
import com.example.demo.repository.ProfileRepository;

@Component
public class ProfileService implements IProfileService{
	
	@Autowired
	ProfileRepository profilerepository;

	@Override
	public void insert(Profile profile) {
		
		profilerepository.save(profile);
	}

	@Override
	public Profile findbyId(String email) {
		
		return profilerepository.findById(email).get();
		
	}

	@Override
	public Profile update(Profile profile) {
		 
		 return profilerepository.save(profile);
		
	}


	@Override
	public void delete(Profile profile) {
	 
		profilerepository.delete(profile);
		
	}

	@Override
	public List<Profile> getall() {
		
		return profilerepository.findAll();
	}

}
