package com.luv2code.spring.withSpringI_IoC_02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}
}
