package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Projects;

@Repository
public interface ProjectsRepository extends JpaRepository<Projects, Integer>{

	@Query("select p from Projects p where p.emailId=:email")
	 public List<Projects> getByEmailId(@Param("email") String email);
}
