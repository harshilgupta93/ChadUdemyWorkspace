package com.luv2code.spring._021_Exercise_DI_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println(">> inside default constructor: BaseballCoach()");
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
