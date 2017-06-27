package com.luv2code.spring._017_LiteralVariable_DI_from_PropertyFile_Value_Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public BaseballCoach() {
		System.out.println(">> inside Java Project: SpringCore");
		System.out.println(">> inside default constructor: BaseballCoach()");
	}
	
	@Override
	public String getDailyWorkoutWithEmailAndTeamName() {

		return "Workout from Baseball Coach "
				+ "\nEmail: " + this.email
				+ "\nTeam : " + this.team; 
	}

}
