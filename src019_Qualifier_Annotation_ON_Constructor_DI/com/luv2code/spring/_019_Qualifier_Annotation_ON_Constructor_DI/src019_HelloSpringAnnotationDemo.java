package com.luv2code.spring._019_Qualifier_Annotation_ON_Constructor_DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src019_HelloSpringAnnotationDemo {

	public static void main(String[] args) {
		
		// Load Spring Configuration File
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("src019_ApplicationContext.xml");
		
		// Retrieve Bean from Spring
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call Methods of Class using Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close the Context
		context.close();
		
	}

}
