
package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Users;


@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	
	public Users findByEmailId(String emailId);
	
@Query("select u from Users u where u.emailId=:emailId and u.password=:password")	
	public List<Users> loginValidate( @Param("emailId") String  emailId , @Param("password") String password); 
}
