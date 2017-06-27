package com.luv2code.spring._013_Object_DI_using_Constructor_Autowired;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		System.out.println(">> Inside default constructor: HappyFortuneService()");
	}
	
	@Override
	public String getFortune() {
		return "Today is your Lucky Day !";
	}

}
