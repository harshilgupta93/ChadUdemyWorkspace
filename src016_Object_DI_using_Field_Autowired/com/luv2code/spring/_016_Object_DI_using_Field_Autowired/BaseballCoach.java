package com.luv2code.spring._016_Object_DI_using_Field_Autowired;

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
		return "Workout From Baseball Coach.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
