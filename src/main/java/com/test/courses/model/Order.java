package com.test.courses.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
	private int orderId;
	private int courseId;
	private int userId;
	private int amount;
}
