package com.luv2code.spring.withSpringI_IoC_02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src002_HelloSpringDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("src002_applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}
}
