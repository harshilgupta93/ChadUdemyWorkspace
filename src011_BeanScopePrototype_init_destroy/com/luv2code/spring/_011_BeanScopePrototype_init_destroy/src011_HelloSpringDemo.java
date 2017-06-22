package com.luv2code.spring._011_BeanScopePrototype_init_destroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src011_HelloSpringDemo {

	public static void main(String[] args) {
		
		//Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src011_BeanScopeApplicationContext.xml");
		
		//Retrieve Bean from Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//Use the Bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the Context
		context.close();
	}

}
