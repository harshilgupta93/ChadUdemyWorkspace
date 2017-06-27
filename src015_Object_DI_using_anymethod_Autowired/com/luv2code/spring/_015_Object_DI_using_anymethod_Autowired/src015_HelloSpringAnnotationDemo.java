package com.luv2code.spring._015_Object_DI_using_anymethod_Autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src015_HelloSpringAnnotationDemo {

	public static void main(String[] args) {

		// Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src015_ApplicationContext.xml");
		
		// Retrieve Bean from Spring Container 
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call methods of class using Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
