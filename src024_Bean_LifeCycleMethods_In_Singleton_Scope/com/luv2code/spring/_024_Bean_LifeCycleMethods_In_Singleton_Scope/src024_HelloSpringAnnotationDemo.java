package com.luv2code.spring._024_Bean_LifeCycleMethods_In_Singleton_Scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src024_HelloSpringAnnotationDemo {

	public static void main(String[] args) {
		
		// Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src024_ApplicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call methods of class using Bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the Context
		context.close();
	}

}
