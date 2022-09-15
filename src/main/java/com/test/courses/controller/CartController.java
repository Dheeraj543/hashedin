package com.test.courses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/cart")
public class CartController {
	@PostMapping("/addToCart/{userId}/{courseId}")
	public Boolean addToCart(@PathVariable int userId,@PathVariable int courseId) {
		return true;
	}
	@DeleteMapping("/deleteFromCart/{userId}/{courseId")
	public Boolean deleteFromCart(@PathVariable int userId,@PathVariable int courseId) {
		return true;
	}
	@GetMapping("/getCartDetails/{userId}")
	public Boolean getCartDetails(@PathVariable int userId) {
		return true;
	}
	@PostMapping("/checkout/{userId}")
	public Boolean checkout(@PathVariable int userId) {
		return true;
	}
}
