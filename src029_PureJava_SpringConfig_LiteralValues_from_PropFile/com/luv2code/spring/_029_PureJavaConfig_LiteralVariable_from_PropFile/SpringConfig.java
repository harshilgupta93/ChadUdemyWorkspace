package com.luv2code.spring._029_PureJavaConfig_LiteralVariable_from_PropFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:data.properties")
public class SpringConfig {

	@Bean
	public Coach baseballCoach(){
		return new BaseballCoach();
	}
}
