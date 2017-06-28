package com.luv2code.spring._024_Bean_LifeCycleMethods_In_Singleton_Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
		return "Workout From Baseball Coach.";
	}
	
	
	/* Defining the init method, which will be called just after creation of Bean
	 * This method will be called after DI and constructor execution*/
	@PostConstruct
	public void doSomeStartUpStuff(){
		System.out.println(">> inside init method: doSomeStartUpStuff()");
	}
	
	
	/* Defining the destroy method, which will be called just before destroying of Bean
	 * This Method is used to release the resources, engaged by the bean
	 * The destroy method is called only in Singleton Scope type.
	 * None of the other scope type can call this method. */
	@PreDestroy
	public void doSomeClosingStuff(){
		System.out.println(">> inside destroy method: doSomeClosingStuff()");
	}


}
