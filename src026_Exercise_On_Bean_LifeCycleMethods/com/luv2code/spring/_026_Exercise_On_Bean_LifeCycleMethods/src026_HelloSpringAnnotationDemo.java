package com.luv2code.spring._026_Exercise_On_Bean_LifeCycleMethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src026_HelloSpringAnnotationDemo {

	public static void main(String[] args) {
		
		// Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src026_ApplicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call Methods of class using Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}

}
