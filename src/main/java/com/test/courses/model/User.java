package com.test.courses.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int userId;
	private String dispayName;
	private String firstName;
	private String lastName;
	

}
