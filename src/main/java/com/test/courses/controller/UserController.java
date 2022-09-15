package com.test.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.courses.model.Enrollment;
import com.test.courses.model.Person;
import com.test.courses.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/addUser")
	public void adduser(@RequestBody Person user) {
		System.out.print(user);
		try {
		userService.add(user);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//return true;
	}
	@PutMapping("/updteUser/{userId}")
	public Boolean updateUser(@PathVariable int userId,@RequestBody Person user) {
		userService.update(user);
		return true;
	}
	@GetMapping("/getEnrollments/{userId}")
	public List<Enrollment> getEnrollments(@PathVariable int userId){
		return null;
	}

}
