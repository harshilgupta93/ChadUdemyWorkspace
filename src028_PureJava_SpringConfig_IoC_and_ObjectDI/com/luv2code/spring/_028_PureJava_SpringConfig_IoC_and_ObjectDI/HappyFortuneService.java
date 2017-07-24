package com.luv2code.spring._028_PureJava_SpringConfig_IoC_and_ObjectDI;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "The Happy Fortune Line.....";
	}

}
