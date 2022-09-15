package com.test.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.courses.model.Person;
import com.test.courses.repository.UserRepository;

@Service
public class UserService {
	@Autowired 
	UserRepository userRepo;
	public void add(Person user) {
		userRepo.save(user);
		//return true;
	}

}
