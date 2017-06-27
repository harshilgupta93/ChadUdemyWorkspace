package com.luv2code.spring._018_Qualifier_Annotation_ON_Field_DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class src018_HelloSpringAnnotationDemo {

	public static void main(String[] args) {

		// Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src018_ApplicationContext.xml");
		
		// Retrieve Bean from Spring Configuration
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call Methods of class using Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}

}
