package com.test.courses.service;

import java.util.Optional;

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
	public void update(Person user) {
		Integer id=user.getUserId();
		Optional<Person> person=userRepo.findById(id);
		
		if(user.getDispayName()!=null) {
			person.get().setDispayName(user.getDispayName());
			//person.setDispayName(user.getDispayName());
		}
		if(user.getFirstName()!=null) {
			person.get().setFirstName(user.getFirstName());
		}
		if(user.getLastName()!=null) {
			person.get().setLastName(user.getLastName());
		}
		//bio type experience domain experience
		if(user.getBio()!=null) {
			person.get().setBio(user.getBio());
		}
		if(user.getExperience()!=0) {
			person.get().setExperience(user.getExperience());
		}
		if(user.getDomainExperience()!=0) {
			person.get().setDomainExperience(user.getDomainExperience());
		}
		userRepo.saveAndFlush(person.get());
	}

}
