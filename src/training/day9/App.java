package com.spring.demo.SpringIOCDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("springdemo.xml");
    	
    	
    	//Dependency injection using setter
    	
    	Student student = (Student) context.getBean("Stud1");
    	System.out.println(student.toString());
    	
    	
    	Demo demo=(Demo)context.getBean("demo1");
    	System.out.println(demo.toString());
    	
    	Employee employee=(Employee) context.getBean("employee1");
    	System.out.println(employee.toString());
  
    	//dependency injection using constructor
    	Customer customer=(Customer)context.getBean("customer1");
    	System.out.println(customer.toString());
    	//    	System.out.println(customer);

    	
    	Demo2 demoobj=(Demo2)context.getBean("demo22");
    	System.out.println(demoobj.toString());
  	
    	Calculator calculator = (Calculator)context.getBean("calculator1");
     	calculator.addition();
     	
     	Calculator calculator1 = (Calculator)context.getBean("calculator2");
     	calculator1.addition();
     	
     	//for bean life cycle
     	//since we need to call destroy() we use AbstractApplicationContext class
     	AbstractApplicationContext context1= new ClassPathXmlApplicationContext("springdemo.xml");
     	context1.registerShutdownHook();
     
     	LifeCycle life=(LifeCycle)context1.getBean("life1");
     	System.out.println(life);
     	
     	BeanLife blife = (BeanLife)context.getBean("life2");
        System.out.println(blife);
     	
    }
}
