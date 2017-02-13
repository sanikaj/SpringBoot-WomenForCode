package com.women.code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class QueryDb {
	
	@Autowired
	private UserRepository userRepository;
    
	public UserRequest saveToRepository(){
		UserRequest userRequest = new UserRequest();
		userRequest.setFirstName("Isaac");
		userRequest.setLastName("Lavoie");
		System.out.println("Save successfull");
		return userRepository.save(userRequest);
		
	}
}
