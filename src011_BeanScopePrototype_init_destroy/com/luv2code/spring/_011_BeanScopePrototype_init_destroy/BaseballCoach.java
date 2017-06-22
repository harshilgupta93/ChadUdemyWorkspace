package com.luv2code.spring._011_BeanScopePrototype_init_destroy;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Workout from Baseball Coach.";
	}
	
	//init method for Bean Life cycle
	public void postConstructMethodYoYO(){
		System.out.println("Method Name: postConstructMethodYoYO");
	}
	
	//destroy method for Bean Life cycle
	//Due to Bean Scope is "Prototype", destroy-method won't be executed
	public void preDestroyMethodYeYe(){
		System.out.println("Method Name: preDestroyMethodYeYe");
	}

}
