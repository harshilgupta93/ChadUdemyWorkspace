package com.luv2code.spring._028_PureJava_SpringConfig_IoC_and_ObjectDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class src028_HelloSpringDemoApp {

	public static void main(String[] args) {

		// Load Spring Configuration CLASS
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Use Methods of class using Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close the Context
		context.close();
	}

}
