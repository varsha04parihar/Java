package com.spring.demo.SpringIOCDemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLife implements InitializingBean, DisposableBean
{
	private int id;
	private String name;
	private String email;
	
	
	
	public BeanLife() {
		super();
	}
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
		return "BeanLife [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	public void destroy() throws Exception 
	{
		System.out.println("Destror() is called...");
		
	}
	
	
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Init() is called ...");
	}
	

}
