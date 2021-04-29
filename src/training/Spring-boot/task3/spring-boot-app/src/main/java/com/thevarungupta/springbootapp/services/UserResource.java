package com.thevarungupta.springbootapp.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thevarungupta.springbootapp.dao.UserDaoResource;
import com.thevarungupta.springbootapp.entities.User;
import com.thevarungupta.springbootapp.exception.UserNotFoundException;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoResource dao;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return dao.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		 User user = dao.findOne(id);
		 if(user==null) {
			throw new UserNotFoundException("User not found");
		 }
		 return user;
	}
	
	@PostMapping("/users/add")
	public void createUser(@RequestBody User user) {
		dao.save(user);
	}
}
