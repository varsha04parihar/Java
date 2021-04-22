package com.spring.demo.SpringIOCDemo;

public class Demo2 {
	private int id;
	private String name;
	private String email;
	
	
	
	public Demo2() {
		super();
	}



	public Demo2(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}



	@Override
	public String toString() {
		return "Demo2 [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
