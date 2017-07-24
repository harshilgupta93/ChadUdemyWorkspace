package com.luv2code.spring._029_PureJavaConfig_LiteralVariable_from_PropFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class src029_SpringDemoApp {

	public static void main(String[] args){
		
		// Load Spring Configuration CLASS
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call Methods of class using bean
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
			
		// Close the context
		context.close();
	}
}
