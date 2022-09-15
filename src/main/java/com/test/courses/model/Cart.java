package com.test.courses.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	private int cartId;
	private int courseId;
	private int quantity;
	private double subTotal;
}
