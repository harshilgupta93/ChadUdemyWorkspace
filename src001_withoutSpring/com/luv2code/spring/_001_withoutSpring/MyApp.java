package com.luv2code.spring._001_withoutSpring;

public class MyApp {

	public static void main(String args[]) {

		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
	}

}
