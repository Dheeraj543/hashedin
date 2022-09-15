package com.test.courses.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.courses.model.Enrollment;
import com.test.courses.model.User;

@Controller
public class UserController {
	@PostMapping("/addUser")
	public Boolean addUser(@RequestBody User user) {
		return true;
	}
	@PutMapping("/updteUser/{userId}")
	public Boolean updateUser(@PathVariable int userId,@RequestBody User user) {
		return true;
	}
	@GetMapping("/getEnrollments/{userId}")
	public List<Enrollment> getEnrollments(@PathVariable int userId){
		return null;
	}

}
