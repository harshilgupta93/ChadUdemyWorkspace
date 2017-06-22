package com.luv2code.spring._007_Exercise_RandomFortunes_OutOf3;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practise Fast bowling today.";
	}

	@Override
	public String getDailyFortune() {

		return "Fortune From CricketCoach: " + fortuneService.getFortune();
	}

}
