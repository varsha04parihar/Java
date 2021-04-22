package com.spring.demo.SpringIOCDemo;

public class LifeCycle
{
	private int id;
	private String name;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "LifeCycle [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	public void init() {
		System.out.println("Init() called...");
	}
	
	public void destroy() {
		System.out.println("Destroy() called...");
	}

}
