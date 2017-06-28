package com.luv2code.spring._026_Exercise_On_Bean_LifeCycleMethods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println(">> inside default constructo: BaseballCoach()");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
