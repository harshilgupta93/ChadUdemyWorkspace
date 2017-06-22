package com.luv2code.spring._004_di_Setter_Object;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class src004_HelloSpringdDemo {

	public static void main(String[] args){
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("src004_applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println("------------------------------------------");
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}
}
