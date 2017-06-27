package com.luv2code.spring._013_Object_DI_using_Constructor_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println(">> inside default constructor: BaseballCoach()");
	}
		
	@Autowired
	public BaseballCoach(FortuneService fortuneService) {
		System.out.println(">> inside parameterized constructor: BaseballCoach(FortuneService fortuneService)");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Workout From Baseball Coach. ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}