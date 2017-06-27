package com.luv2code.spring._012_Component_Annotation;

import org.springframework.stereotype.Component;


/* 
 * Bean Id name can be generated in two ways:
 *  1) Explicitly 
 *  2) Default
 * 
 * The Default Bean Id Name is the Class Name with 
 * first latter being small alphabet. As for an 
 * example, for class name "BaseballCoach", the 
 * Default bean id will be "baseballCoach"
 * 
 * Here we "Explicitly" mentioned the Bean id name
 * which is "theSillyCoach" as 
 * @Component("thatSillyCoach")
 * 
 * For Default Bean Id setup, use the Component 
 * Annotation, as
 * @Component
 * Spring will automatically create Bean id Name
 * as "baseballCoach" for class name 
 * "BaseballCoach"  
 * 
 * */


@Component("thatSillyCoach")
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Workout from Baseball Coach.";
	}

}
