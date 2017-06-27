package com.luv2code.spring._018_Qualifier_Annotation_ON_Field_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")    /* for Component class "HappyFortuneService" */
//	@Qualifier("randomFortuneService") 	 /* for Component class "RandomFortuneService" */
//	@Qualifier("RESTFortuneService")     /* for Component class "RESTFortuneService" */
//	@Qualifier("databaseFortuneService") /* for Component class "DatabaseFortuneService" */		
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println(">> inside default constructor: BaseballCoach()");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Workout from Baseball Coach. ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
