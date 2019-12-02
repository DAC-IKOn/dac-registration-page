package com.dac.repository;

import org.springframework.data.repository.CrudRepository;

import com.dac.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {	
	
	public User findByUsernameAndPassword(String username, String password);
}
