package com.luv2code.spring._014_Object_DI_using_Setter_Autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src014_HelloSpringAnnotationDemo {

	public static void main(String[] args) {

		// Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src014_ApplicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call Methods of Class using Bean 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close context
		context.close();
		
	}

}
