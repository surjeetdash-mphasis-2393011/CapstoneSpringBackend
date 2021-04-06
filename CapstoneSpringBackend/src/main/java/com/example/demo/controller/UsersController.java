package com.myapp.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.myapp.spring.model.Users;
import com.myapp.spring.service.IUsersService;



@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin
//@RequestMapping("/token")
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
		
		String tempContact = users.getEmail();

		
		
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
	
	@PutMapping("/")
	public void updateUsers(@RequestBody Users users)
	{
		System.out.println("Updating ... "+users);
		usersService.update(users);
	}
	
//	@DeleteMapping("/{id}")
//	public void deleteUsers(@PathVariable("id") String id)
//	{
//		Users users=findUsersById(id);
//		usersService.delete(users);
//	}
//	
		

}
