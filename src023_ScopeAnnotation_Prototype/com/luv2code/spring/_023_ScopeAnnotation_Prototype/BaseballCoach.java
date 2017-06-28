package com.luv2code.spring._023_ScopeAnnotation_Prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BaseballCoach implements Coach {

	public BaseballCoach() {
		System.out.println(">> inside default constructor: BaseballCoach()");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Workout from Baseball Coach.";
	}

}

/* Due to prototype scope, 
 * every time when we define a new Bean,
 * the constructor will be called. */

