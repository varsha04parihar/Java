package com.spring.demo.SpringIOCDemo;

public class Customer
{
	private int id;
	private String name;
	private Date date;
	
	public Customer(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	
	
	
}
