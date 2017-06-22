package com.luv2code.spring._06_diSetterLiteralVar_PropertyFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src006_HelloSpringDemo {

	public static void main(String[] args){
		
		System.out.println("-------------------------------------");
		System.out.println("In main method before ClassPathXmlApplicationContext class.");
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src006_applicationContext.xml");
		
		System.out.println("-------------------------------------");
		System.out.println("In main method after ClassPathXmlApplicationContext class.");
		
		BaseballCoach theCoach = context.getBean("myCoach", BaseballCoach.class);
		
		System.out.println("-------------------------------------");
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeamName());
		
		context.close();
	}
}
