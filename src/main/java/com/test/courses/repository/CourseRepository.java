package com.test.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.courses.model.Course;



public interface CourseRepository extends JpaRepository<Course, Integer> {

}