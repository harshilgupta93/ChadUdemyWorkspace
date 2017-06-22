package com.luv2code.spring._004_di_Setter_Object;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
		
	public BaseballCoach() {
		System.out.println("in no-arg Constructor: BaseballCoach()");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("in Setter Method: setFortuneService()");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "BaseballCoach: Workout";
	}

	@Override
	public String getDailyFortune() {
		return "From BaseballCoach: " + fortuneService.getFortune();
	}

}
