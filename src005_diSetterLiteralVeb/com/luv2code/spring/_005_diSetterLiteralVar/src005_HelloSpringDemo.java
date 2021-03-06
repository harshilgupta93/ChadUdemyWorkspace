package com.luv2code.spring._005_diSetterLiteralVar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src005_HelloSpringDemo {

	public static void main(String[] args){
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src005_applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class);
		
		
		System.out.println("-------------------------------------");
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeamName());
		
		context.close();
	}
}
