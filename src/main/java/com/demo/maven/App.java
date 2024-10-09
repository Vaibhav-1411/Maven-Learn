package com.demo.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Container created here using ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Dev obj = (Dev) context.getBean("dev");
		// obj.build(); // no need for this

		/*
		 * System.out.println(obj.age); // it will give 0 bcz value not assigned to age
		 * variable//
		 */

// if we assign value then use //
		/*
		 * obj.age=18; System.out.println(obj.age); // it will give 18 bcz value
		 * assigned 18 //
		 */

//If using getter Setter then use this //
		
		  obj.setAge(18); 
		  System.out.println(obj.getAge()); // it will give 18 bcz value assigned 18 //
		 
	}
}





/*
 * public class App { 
 * 	public static void main( String[] args ) {
 * 	System.out.println( "Hello World!" );
 * 
 * ApplicationContext context = new
 * ClassPathXmlApplicationContext("spring.xml");
 * 
 * Dev obj = (Dev) context.getBean("dev"); // Dev obj =
 * context.getBean(Dev.class); Dev obj1 = (Dev) context.getBean("dev1");
 * 
 * obj.build(); } }
 */