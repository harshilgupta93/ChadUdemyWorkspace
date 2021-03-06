package com.luv2code.spring._016_Object_DI_using_Field_Autowired;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		System.out.println(">> inside default constructor: HappyFortuneService()");
	}
	
	@Override
	public String getFortune() {
		return "Today is your lucky day !";
	}

}
