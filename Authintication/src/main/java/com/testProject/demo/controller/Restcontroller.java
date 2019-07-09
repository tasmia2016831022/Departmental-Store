package com.testProject.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testProject.demo.model.User;
import com.testProject.demo.services.UserService;

@RestController
public class Restcontroller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String hello()
	{
		return "This is home page";
		
	}
	
	//save user to db
	@GetMapping("/save-user")
	public String saveUser(@RequestParam String username ,@RequestParam String address ,@RequestParam int phone,@RequestParam String password)
	{
		
		User user = new User(username,address,phone,password);
		userService.saveMyUser(user);
		return "User Saved";
	}
}
