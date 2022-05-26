package com.spring.docker.compose.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.docker.compose.models.User;
import com.spring.docker.compose.services.user.UserService;

@RestController
public class UserController{
	@Autowired
	private UserService userService;

	@RequestMapping(method= RequestMethod.GET, value="/")
	public String index() {
		return "Hello BJIT!";
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/user/add")
	public String add() {
		User user = new User();
		user.setEmail("mamunbdaiub@gmail.com");
		user.setFirstName("Abdullah");
		user.setLastName("Mamun");
		user.setUsername("mamun");
		User savedUserObj = userService.save(user);
		return savedUserObj!=null ? "User saved successfully": "";
	}
	
} 