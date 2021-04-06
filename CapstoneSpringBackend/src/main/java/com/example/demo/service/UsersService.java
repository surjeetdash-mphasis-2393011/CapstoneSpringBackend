package com.myapp.spring.service;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myapp.spring.model.Users;
import com.myapp.spring.repository.UsersRepository;




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
		
		return usersRespository.findByEmail(email);
		//return usersRespository.find();
	}

	
	

}
