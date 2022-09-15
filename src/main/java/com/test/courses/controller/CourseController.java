package com.test.courses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.courses.entities.Review;
import com.test.courses.model.Course;

@Controller
public class CourseController {
	@GetMapping("/getDetails/{courseId}")
	public Boolean getDetils(@PathVariable int courseId) {
		return true;
	}
	@PostMapping("/addCourse/{userId}")
	public Boolean addCourse(@PathVariable int userId,@RequestBody Course course) {
		return true;
	}
	@DeleteMapping("/deleteCourse/{userId}/{courseId}")
	public Boolean deleteCourse(@PathVariable int userId,@PathVariable int courseId) {
		return true;
	}
	@PostMapping("/review/{userId}/{courseId}")
	public Boolean review(@RequestBody Review review) {
		return true;
	}
}
