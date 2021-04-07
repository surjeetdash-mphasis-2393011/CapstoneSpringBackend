package com.example.demo.service;





import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;





@Component("usersService")
public class UsersService implements IUsersService  {
	
	@Autowired
	private UsersRepository usersRespository;

	@Override
	public Users create(Users users) {
		
		return usersRespository.save(users);
	}

	@Override
	public List<Users> read() {
		
		return usersRespository.findAll();
	}



	@Override
	public void update(Users users) {
		
		usersRespository.save(users);
	}

	@Override
	public void delete(Users users) {
		usersRespository.delete(users);
		
	}

	@Override
	public Users fetchUsersByEmail(String email) {
		
		return usersRespository.findByEmailId(email);
		//return usersRespository.find();
	}

	@Override
	public int loginValidate(String emailId, String password) {
		
		return usersRespository.loginValidate(emailId, password).size()==1? 1 :0;
	}

	


	
	

}
