package com.luv2code.spring._07_Exercise_RandomFortunes_OutOf3;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] arrayOfFortunes = {
			"(1) Today Is Your Lucky Day !", 
			"(2) Have A Good Day !", 
			"(3) Have A Nice Day Ahead !"
			};
	
	private Random randomNumber = new Random();
	
	@Override
	public String getFortune() {
		
		return arrayOfFortunes[randomNumber.nextInt(arrayOfFortunes.length)];
	}

}
