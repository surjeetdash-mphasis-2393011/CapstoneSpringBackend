package com.myapp.spring.service;

import java.util.List;

import com.myapp.spring.model.Users;



public interface IUsersService {

	Users create(Users users);

	List<Users> read();

	//Users read(Integer id);

	void update(Users users);

	void delete(Users users);
	Users fetchUsersByEmail(String email);

	

	


	
	
 

}

