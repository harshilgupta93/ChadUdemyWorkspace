package com.luv2code.spring._016_Object_DI_using_Field_Autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src016_HelloSpringAnnotationDemo {

	public static void main(String[] args) {
		
		// Load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src016_ApplicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call Methods of class using Bean 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close the Context
		context.close();
	}

}
