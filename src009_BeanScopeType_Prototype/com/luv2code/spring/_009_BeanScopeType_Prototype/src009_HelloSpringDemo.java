package com.luv2code.spring._009_BeanScopeType_Prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class src009_HelloSpringDemo {

	public static void main(String[] args) {

		// Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("src009_BeanScopeApplicationContext.xml");

		
		//Retrieve Bean from Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Check the result
		boolean result = (theCoach == alphaCoach);
		
		//Print the Result
		System.out.println("Both the beans referring same Memory Location: " + result);
		System.out.println("Memory Location of bean theCoach: " + theCoach);
		System.out.println("Memory Location of bean alphaCoach: " + alphaCoach);

		// close context
		context.close();
	}

}
