package com.luv2code.spring._019_Qualifier_Annotation_ON_Constructor_DI;

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
	public BaseballCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		System.out.println(">> inside parameterized constructor: BaseballCoach(FortuneService fortuneService) {");
		this.fortuneService = fortuneService;
	}
	/* In the "BaseballCoach(@Qualifier("happyFortuneService") FortuneService fortuneService)" 
	 * constructor, @Qualifier("happyFortuneService") decides which implementation of the
	 * interface "FortuneService" is qualified to create object.
	 * Here, there are four implementations as 
	 * - For HappyFortuneService, @Qualifier("happyFortuneService") 
	 * - For RandomFortuneService, @Qualifier("randomFortuneService") 
	 * - For RESTFortuneService, @Qualifier("RESTFortuneService") 
	 * - For DatabaseFortuneService, @Qualifier("databaseFortuneService") 
	 * So, we need to change the bean id at @Quaifier("Bean_Id_Name") annotation
	 * to call respected Component Class
	 */

	@Override
	public String getDailyWorkout() {
		return "Workout from Baseball Coach.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
