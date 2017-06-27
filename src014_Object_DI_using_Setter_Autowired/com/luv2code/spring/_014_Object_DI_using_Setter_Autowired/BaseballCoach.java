package com.luv2code.spring._014_Object_DI_using_Setter_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println(">> inside default constructor: BaseballCoach() ");
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> inside setter method: setFortuneService(FortuneService fortuneService)");
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
