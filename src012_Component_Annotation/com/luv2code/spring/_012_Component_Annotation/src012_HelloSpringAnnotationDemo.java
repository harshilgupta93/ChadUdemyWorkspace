package com.luv2code.spring._012_Component_Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src012_HelloSpringAnnotationDemo {

	public static void main(String[] args) {

		
		// Load Spring Configuration File
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("src012_componentAnnotationApplicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		// Use Methods of Bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the Context
		context.close();
	}

}
