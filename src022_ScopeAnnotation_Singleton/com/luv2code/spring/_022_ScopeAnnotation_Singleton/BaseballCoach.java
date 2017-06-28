package com.luv2code.spring._022_ScopeAnnotation_Singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BaseballCoach implements Coach {

	public BaseballCoach() {
		System.out.println(">> inside default constructor: BaseballCoach()");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Workout from Baseball Coach.";
	}

}


/* Here we are using "Scope" annotation and type is "singleton".
 * By default the type of the scope is also singleton.
 * So if we remove this annotation, the outcome won't change.*/