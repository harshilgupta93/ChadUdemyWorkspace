package com.luv2code.spring._010_BeanScopeSingleton_init_destroy;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Workout from Baseball Coach.";
	}
	
	//init method for Bean Life Cycle
	public void postConstructMethodYoYo(){
		System.out.println("Method Name: postConstructMethodYoYo ");
	}
	
	//destroy method for Bean Life Cycle
	public void preDestroyMethodYeYe(){
		System.out.println("Method Name: preDestroyMethodYeYe");
	}

}
