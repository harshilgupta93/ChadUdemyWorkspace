package com.luv2code.spring._028_PureJava_SpringConfig_IoC_and_ObjectDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public FortuneService happyFortuneService(){
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach baseballCoach(){
		return new BaseballCoach(happyFortuneService());
	}
}
