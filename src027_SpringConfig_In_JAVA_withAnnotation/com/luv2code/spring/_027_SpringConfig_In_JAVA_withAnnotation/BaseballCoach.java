package com.luv2code.spring._027_SpringConfig_In_JAVA_withAnnotation;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Workout Instructions. . . .";
	}

}
