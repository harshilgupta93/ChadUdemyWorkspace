package com.luv2code.spring._04_di_Setter_Object;


public class HappyFortuneService implements FortuneService {

	
	
	public HappyFortuneService() {
		System.out.println("in no-arg Constructor: HappyFortuneService()");
	}

	@Override
	public String getFortune() {
		
		return "Happy Fortune Service";
	}

}
