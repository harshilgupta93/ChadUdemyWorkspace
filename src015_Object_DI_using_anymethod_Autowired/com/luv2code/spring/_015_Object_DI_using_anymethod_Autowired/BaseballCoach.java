package com.luv2code.spring._015_Object_DI_using_anymethod_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println(">> inside default constructor: BaseballCoach() ");
	}
	
	@Autowired
	public void doSomeStuffYoYo(FortuneService fortuneService){
		System.out.println(">> inside a method(which is working equivalent to setter method): doSomeStuffYoYo(FortuneService fortuneService)");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Workout from Baseball Coach.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
