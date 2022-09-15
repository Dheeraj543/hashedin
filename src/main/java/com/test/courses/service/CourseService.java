package com.test.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.courses.model.Course;
import com.test.courses.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository course;
	public void addCourse(Course c) {
		course.save(c);
	}
	public void deleteCourse(int c) {
		course.deleteById(c);
	}

}
