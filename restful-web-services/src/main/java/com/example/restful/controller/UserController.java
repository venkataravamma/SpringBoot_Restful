package com.example.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.restful.bean.User;
import com.example.restful.services.UserDaoService;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService service;
	
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return service.findAll();
	}
	
	//retrieves a specific user detail 
	@GetMapping("/user/{id}")
	public User retiveUser(@PathVariable int id) {
		return service.findOne(id);
	}

}
