package com.luv2code.spring._03_Dependency_Injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println("--------------------------------");
		System.out.println(theCoach.getDailyWork());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}
}
