package com.luv2code.spring._020_Qualifier_Annotation_ON_Setter_DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class src20_HelloSpringAnnotationDemo {

	public static void main(String[] args) {

		// Load Spring Configuration File
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("src020_ApplicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call Methods of class using Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}

}
