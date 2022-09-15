package com.test.courses.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Category {
	public Category() {
		super();
	}
	@Id
	private int categoryId;
	private String name;
	@ManyToMany
	@JoinTable(
			name="course_category",
			joinColumns=@JoinColumn(name="courseId"),
			inverseJoinColumns = @JoinColumn(name="categoryId")
			)
	private Set<Course> courses;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
}
