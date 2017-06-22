package com.luv2code.spring._05_diSetterLiteralVar;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String teamName;
	
	public CricketCoach() {
		System.out.println("in no-arg constructor : CricketCoach()");
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("in setter method : setEmailAddress(String emailAddress)");
		this.emailAddress = emailAddress;
	}
	
	public void setTeamName(String teamName) {
		System.out.println("in setter method : setTeamName(String teamName)");
		this.teamName = teamName;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("in setter method : setFortuneService(FortuneService fortuneService) ");
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	@Override
	public String getDailyWorkout() {

		return "CricketCoach : Workout";
	}

	@Override
	public String getDailyFortune() {
		
		return "From CricketCoach: " + fortuneService.getFortune();
	}
}
