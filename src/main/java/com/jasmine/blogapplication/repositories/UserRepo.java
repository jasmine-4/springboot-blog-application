package com.jasmine.blogapplication.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jasmine.blogapplication.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
		
	
	Optional<User> findByEmail(String email);
}
