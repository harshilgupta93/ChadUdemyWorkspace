package com.luv2code.spring._005_diSetterLiteralVar;

public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService() {
		System.out.println("in no-arg constructor: HappyFortuneService()");
	}

	@Override
	public String getFortune() {

		return "Happy Fortune Service.";
	}

}
