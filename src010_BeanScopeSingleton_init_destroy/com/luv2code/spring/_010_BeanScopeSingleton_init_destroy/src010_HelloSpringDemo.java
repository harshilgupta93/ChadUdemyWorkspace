package com.luv2code.spring._010_BeanScopeSingleton_init_destroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src010_HelloSpringDemo {

	public static void main(String[] args) {

		//Load Spring Configuration File
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("src010_BeanScopeApplicationContext.xml");
		
		//Retrieve bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//Use the Bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the Context
		context.close();
	}

}
