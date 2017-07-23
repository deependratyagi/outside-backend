package com.outside.backend.dao;

import org.springframework.stereotype.Repository;

import com.outside.backend.user.UserIn;

@Repository
public interface UserRegistrationRepo {

	public UserIn addUser(UserIn user); 
	
}
