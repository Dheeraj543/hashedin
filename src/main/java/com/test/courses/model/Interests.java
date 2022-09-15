package com.test.courses.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Interests {
	public Interests() {
		super();
	}
	@Id
	private int interestId;
	@ManyToMany(mappedBy="interest")
	Set<Person> users;
	private String name;
	public int getInterestId() {
		return interestId;
	}
	public void setInterestId(int interestId) {
		this.interestId = interestId;
	}
	public Set<Person> getUsers() {
		return users;
	}
	public void setUsers(Set<Person> users) {
		this.users = users;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
