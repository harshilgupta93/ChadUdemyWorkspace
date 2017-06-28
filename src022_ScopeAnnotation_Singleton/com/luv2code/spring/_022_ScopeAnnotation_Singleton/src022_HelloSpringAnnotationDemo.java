package com.luv2code.spring._022_ScopeAnnotation_Singleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src022_HelloSpringAnnotationDemo {

	public static void main(String[] args) {
		
		// Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src022_ApplicationContext.xml");
		
		// Retrieve bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		Coach alphaCoach = context.getBean("baseballCoach", Coach.class);
		
		// Check the Beans are pointing the same memory location or not
		boolean result = (theCoach == alphaCoach);
		
		// Print the result
		System.out.println("Both the beans pointing same memory location: " + result);
		System.out.println("Memory Location of theCoach bean: " + theCoach);
		System.out.println("Memory location of alphaCoach bean: " + alphaCoach);
		
		// Close the context
		context.close();
	}

}
