package com.luv2code.spring._025_Bean_LifeCycleMethods_In_Prototype_Scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src25_HelloSpringAnnotationDemo {

	public static void main(String[] args) {
		
		// Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src025_ApplicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call Methods of class using Bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the Context
		context.close();
	}

}
