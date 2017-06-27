package com.luv2code.spring._020_Qualifier_Annotation_ON_Setter_DI;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {
			"(RandomFortuneService) 1st Fortune",
			"(RandomFortuneService) 2nd Fortune",
			"(RandomFortuneService) 3rd Fortune"
	};	
	
	private Random randomNumber = new Random();
	
	public RandomFortuneService() {
		System.out.println(">> inside default constructor: RandomFortuneService() ");
	}
	
	@Override
	public String getFortune() {
		int index = randomNumber.nextInt(fortunes.length);
		String fortuneString = fortunes[index]; 
		return fortuneString;
	}

}
