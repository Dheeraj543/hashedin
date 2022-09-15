package com.test.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.courses.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}