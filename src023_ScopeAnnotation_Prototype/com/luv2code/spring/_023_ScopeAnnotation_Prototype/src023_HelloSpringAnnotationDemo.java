package com.luv2code.spring._023_ScopeAnnotation_Prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src023_HelloSpringAnnotationDemo {

	public static void main(String[] args) {

		// Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src023_ApplicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		Coach alphaCoach = context.getBean("baseballCoach", Coach.class);
		
		// Check the beans are pointing same memory location or not
		boolean result = ( theCoach == alphaCoach);
		
		// Print the result
		System.out.println("Both the Beans pointing same memory location: " + result);
		System.out.println("Memory Location of theCoach bean: " + theCoach);
		System.out.println("Memory Location of alphaCoach bean: " + alphaCoach);
		
		// close the context
		context.close();
	}

}
