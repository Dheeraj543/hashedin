package com.test.courses.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Person {

	public Person() {
		super();
	}
	public Person(int userId, String dispayName, String firstName, String lastName, String bio, Set<Interests> interest,
			int type, int experience, int domainExperience) {
		super();
		this.userId = userId;
		this.dispayName = dispayName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		//this.interest = interest;
		this.type = type;
		this.experience = experience;
		this.domainExperience = domainExperience;
	}
	@Id
	private int userId;
	private String dispayName;
	private String firstName;
	private String lastName;
	private String bio;
//	@ManyToMany
//	@JoinTable(
//	  name = "course_like", 
//	  joinColumns = @JoinColumn(name = "student_id"), 
//	  inverseJoinColumns = @JoinColumn(name = "course_id"))
//	Set<Course> likedCourses;
	
	
	@ManyToMany
	@JoinTable(
			name="user_interests",
			joinColumns=@JoinColumn(name="userId"),
			inverseJoinColumns = @JoinColumn(name="interestId")
			)
	private Set<Interests> interest;
	private int type;
	private int experience;
	private int domainExperience;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getDispayName() {
		return dispayName;
	}
	public void setDispayName(String dispayName) {
		this.dispayName = dispayName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getDomainExperience() {
		return domainExperience;
	}
	public void setDomainExperience(int domainExperience) {
		this.domainExperience = domainExperience;
	}
	public Set<Interests> getInterest() {
		return interest;
	}
	public void setInterest(Set<Interests> interest) {
		this.interest = interest;
	}
	@Override
	public String toString() {
		return "Person [userId=" + userId + ", dispayName=" + dispayName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", bio=" + bio +  ", type=" + type + ", experience=" + experience
				+ ", domainExperience=" + domainExperience + "]";
	}

}
