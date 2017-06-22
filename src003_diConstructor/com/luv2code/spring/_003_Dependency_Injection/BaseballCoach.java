package com.luv2code.spring._003_Dependency_Injection;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println("in no-arg constructor: BaseballCoach()");
	}

	public BaseballCoach(FortuneService fortuneService) {
		System.out.println("in arg constructor: BaseballCoach(FortuneService fortuneService)");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWork() {
		
		return "BaseballCoach : Workout";
	}

	@Override
	public String getDailyFortune() {
		
		return "From BaseballCoach: " +fortuneService.getFortune();
	}

}
