package com.luv2code.spring._007_Exercise_RandomFortunes_OutOf3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src007_HelloSpringDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src007_applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
