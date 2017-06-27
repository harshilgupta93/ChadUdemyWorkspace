package com.luv2code.spring._019_Qualifier_Annotation_ON_Constructor_DI;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	public DatabaseFortuneService() {
		System.out.println(">> inside default constructor : DatabaseFortuneService()");
	}
	
	@Override
	public String getFortune() {
		return "(DatabaseFortuneService) Today is your lucky day !";
	}

}
