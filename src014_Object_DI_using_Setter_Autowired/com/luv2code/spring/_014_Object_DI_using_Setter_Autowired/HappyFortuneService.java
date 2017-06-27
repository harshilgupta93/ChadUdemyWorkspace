package com.luv2code.spring._014_Object_DI_using_Setter_Autowired;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		System.out.println(">> inside default constructor: HappyFortuneService()");
	}
	
	@Override
	public String getFortune() {
		return "Today is your lucky day ! ";
	}

}
