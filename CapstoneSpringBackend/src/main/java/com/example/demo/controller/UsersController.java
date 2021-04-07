package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.service.IUsersService;




@RestController

@CrossOrigin

@RequestMapping("/users")

public class UsersController {

	@Autowired
	IUsersService usersService;
	
	@GetMapping("/")
	public List<Users> getAllUsers()
	{
		return usersService.read();
	}
	
	
	@PostMapping("/")
	public Users addUsers(@RequestBody Users users) throws Exception
	{
		
		String tempContact = users.getEmailId();

		
		
		if(tempContact != null &&  tempContact!= "") {
			Users uo = usersService.fetchUsersByEmail(tempContact);
			if(uo != null) {
				throw new Exception("user with "+tempContact+ " is already exits");
			}
		}
		
	
		
		Users uo= null;
		//System.out.println("adding..."+users);
		uo = usersService.create(users);
		
		return uo;
	}
	
	
	@GetMapping("/login/{id}/{password}")
	public int  login(@PathVariable("id") String id , @PathVariable("password") String password ) {
		
		int result = usersService.loginValidate(id, password);
		
		if(result == 1) {
			return 1;
		}else {
			return 0;
		}
		
		 
	}
	
	
	
//	@GetMapping("/{id}")
//	public Users findUsersById(@PathVariable("id") String id)
//	{
//		Users users=null;
//		try {
//		users = usersService.read(id);
//		}catch(Exception ex)
//		{
//			return null;
//		}
//		return users;
//	}
	
//	@PutMapping("/")
//	public void updateUsers(@RequestBody Users users)
//	{
//		System.out.println("Updating ... "+users);
//		usersService.update(users);
//	}
	
//	@DeleteMapping("/{id}")
//	public void deleteUsers(@PathVariable("id") String id)
//	{
//		Users users=findUsersById(id);
//		usersService.delete(users);
//	}
//	
		

}



