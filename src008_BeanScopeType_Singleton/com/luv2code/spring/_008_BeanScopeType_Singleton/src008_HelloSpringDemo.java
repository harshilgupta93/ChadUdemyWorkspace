package com.luv2code.spring._008_BeanScopeType_Singleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src008_HelloSpringDemo {

	public static void main(String[] args) {

		//Load Spring Configuration File
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("src008_BeanScopeApplicationContext.xml");

		//Retrieve bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Checking the bean
		boolean result = (theCoach == alphaCoach);
		
		//Print the result
		System.out.println("Both beans referring same memory location: " + result);
		System.out.println("Memory Location of theCoach: " + theCoach);
		System.out.println("Memory Location of alphaCoach: " + alphaCoach);
		
		//Close the context
		context.close();
	}

}
