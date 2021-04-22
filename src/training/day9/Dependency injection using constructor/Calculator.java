package com.spring.demo.SpringIOCDemo;

public class Calculator 
{
	private int n1;
	private int n2;
	
	public Calculator(double n1,double n2)
	{
		this.n1=(int) n1;
		this.n2=(int) n2;
		System.out.println("Constructor with parameter of type double");
	}
	
	public Calculator(int n1,int n2)
	{
		this.n1= n1;
		this.n2= n2;
		System.out.println("Constructor with parameter of type int");
	}
	
	public Calculator(String n1,String n2)
	{
		this.n1= Integer.parseInt(n1);
		this.n2=Integer.parseInt(n2);
		System.out.println("Constructor with parameter of type string");
	}
	
	public void addition() {
		System.out.println("Num 1: "+ this.n1);
		System.out.println("Num 2: "+this.n2);
		System.out.println("Addition = "+(n1+n2));
	}
}
