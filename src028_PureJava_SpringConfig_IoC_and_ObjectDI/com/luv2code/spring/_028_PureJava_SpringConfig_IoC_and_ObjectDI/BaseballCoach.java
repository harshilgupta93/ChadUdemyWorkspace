package com.luv2code.spring._028_PureJava_SpringConfig_IoC_and_ObjectDI;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Workout Line. . . . ..";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
