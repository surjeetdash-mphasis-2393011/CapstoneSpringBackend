package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Users;



public interface IUsersService {

	Users create(Users users);

	List<Users> read();

	//Users read(Integer id);

	void update(Users users);

	void delete(Users users);
	Users fetchUsersByEmail(String email);
	
	public int loginValidate(String  emailId , String password); 
	

	

	


	
	
 

}

