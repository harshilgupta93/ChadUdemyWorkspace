package com.luv2code.spring._017_LiteralVariable_DI_from_PropertyFile_Value_Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src017_HelloSpringAnnotationDemo {

	public static void main(String[] args) {

		// Load Spring Configuration
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("src017_ApplicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call Methods of class using Bean
		System.out.println(theCoach.getDailyWorkoutWithEmailAndTeamName());
		
		// Close the context
		context.close();
	}

}
