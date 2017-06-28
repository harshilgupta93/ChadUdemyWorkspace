package com.luv2code.spring._025_Bean_LifeCycleMethods_In_Prototype_Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
	
	/* Defining the init method, which will be called just after creation of Bean
	 * This method will be called after DI and constructor execution*/
	@PostConstruct
	public void doSomeStartUpStuff(){
		System.out.println(">> inside init method: doSomeStartUpStuff()");
	}
	
	/* Defining the destroy method, which will be called just before destroying of Bean, 
	 * But due to Prototype Scope, the destroy method won't be executed,
	 * Only init method will be executed.*/
	@PreDestroy
	public void doSomeClosingStuff(){
		System.out.println(">> inside destroy method: doSomeClosingStuff()");
	}
	
}
