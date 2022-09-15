package com.test.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.courses.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository course;

}
