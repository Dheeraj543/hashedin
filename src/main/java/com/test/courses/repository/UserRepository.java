package com.test.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.courses.model.Person;

public interface UserRepository extends JpaRepository<Person, Integer> {

}