package com.training.springbootapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoResource 
{
private static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User(1, "Jimin", new Date()));
		users.add(new User(2, "Lisa", new Date()));
		users.add(new User(3, "Ellijah", new Date()));
		users.add(new User(4, "Sam", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id) {
		for(User user: users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}

}
