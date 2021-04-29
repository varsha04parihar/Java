package com.training.springbootapp.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;

import com.training.springbootapp.entities.User;

@Component
public class UserDaoResource {

	private int userCount = 4;
	private static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User(1, "Mark", new Date()));
		users.add(new User(2, "Paul", new Date()));
		users.add(new User(3, "John", new Date()));
		users.add(new User(4, "Page", new Date()));
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
	
	public void save(User user) {
		if(user.getId()==null) {
			user.setId(++userCount);
		}
		users.add(user);
	}
	
	public boolean delete(int id) {
		User user = findOne(id);
		if(user != null) {
			users.remove(user);
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean update(int id, User updateUser) {
		User user = findOne(id);
		if(user != null) {
			
			users.set(id-1, updateUser);
			return true;
		}else {
			return false;
		}
	}
	
}
