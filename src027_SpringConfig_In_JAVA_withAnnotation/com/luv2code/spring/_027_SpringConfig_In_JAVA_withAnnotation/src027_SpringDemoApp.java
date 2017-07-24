package com.luv2code.spring._027_SpringConfig_In_JAVA_withAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class src027_SpringDemoApp {

	public static void main(String[] args) {
		
		// Load Spring Configuration Class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call methods of class using bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the context
		context.close();

	}

}
