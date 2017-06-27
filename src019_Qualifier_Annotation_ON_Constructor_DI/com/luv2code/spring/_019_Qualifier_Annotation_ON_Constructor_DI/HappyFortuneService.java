package com.luv2code.spring._019_Qualifier_Annotation_ON_Constructor_DI;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		System.out.println(">> inside default constructor: HappyFortuneService()");
	}
	
	@Override
	public String getFortune() {
		return "(HappyFortuneService) Today is your lucky day !";
	}

}
