package com.test.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.courses.entities.Review;
import com.test.courses.model.Course;
import com.test.courses.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService courseService;
	@GetMapping("/getDetails/{courseId}")
	public Boolean getDetils(@PathVariable int courseId) {
		return true;
	}
	@PostMapping("/addCourse")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	//	return true;
	}
	@DeleteMapping("/deleteCourse/{courseId}")
	public void deleteCourse(@PathVariable int courseId) {
		courseService.deleteCourse(courseId);
		//return true;
	}
	@PostMapping("/review/{userId}/{courseId}")
	public Boolean review(@RequestBody Review review) {
		return true;
	}
}
