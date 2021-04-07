package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Profile;
import com.example.demo.service.IProfileService;

@RestController
@CrossOrigin
@RequestMapping("/profile")
public class ProfileController {

	@Autowired
	IProfileService ips;

	@GetMapping
	public List<Profile> getAllProfiles() {

		return ips.getall();
	}

	@GetMapping("/{id}")
	public Profile getbyId(@PathVariable("id") String id) {
		
		Profile  profile = null;
		try {
			profile= ips.findbyId(id);
		} catch (Exception e) {
			return null;
		}
		
		return profile;
	}


       @PostMapping("")
       public void createProfile(@RequestBody Profile profile) {
	   ips.insert(profile);

}
       
       @PutMapping("/updateprofile")
       public Profile updateprofile(@RequestBody Profile profile) {
    	   return ips.update(profile);
       }
       
       }