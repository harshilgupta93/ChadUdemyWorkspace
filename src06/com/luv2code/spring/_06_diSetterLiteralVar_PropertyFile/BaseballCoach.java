package com.luv2code.spring._06_diSetterLiteralVar_PropertyFile;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String teamName;
	
	public BaseballCoach() {
		
		System.out.println("in no-arg constructor: BaseballCoach()");		
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("in setter method: setFortuneService(FortuneService fortuneService)");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("in setter method: setEmailAddress(String emailAddress)");
		this.emailAddress = emailAddress;
	}

	public void setTeamName(String teamName) {
		System.out.println("in setter method: setTeamName(String teamName)");
		this.teamName = teamName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	@Override
	public String getDailyWorkout() {

		return "BaseballCoach: Workout";
	}

	@Override
	public String getDailyFortune() {

		return "BaseballCoach: " + fortuneService.getFortune();
	}

}
