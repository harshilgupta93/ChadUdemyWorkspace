package com.luv2code.spring._020_Qualifier_Annotation_ON_Setter_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println(">> inside default constructor: BaseballCoach()");
	}
	
	@Autowired
	@Qualifier("happyFortuneService")    /* for Component class "HappyFortuneService" */
//	@Qualifier("randomFortuneService") 	 /* for Component class "RandomFortuneService" */
//	@Qualifier("RESTFortuneService")     /* for Component class "RESTFortuneService" */
//	@Qualifier("databaseFortuneService") /* for Component class "DatabaseFortuneService" */
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> inside setter method: setFortuneService(FortuneService fortuneService)");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Workout from Baseball Coach. ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
