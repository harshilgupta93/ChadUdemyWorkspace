package com.luv2code.spring._029_PureJavaConfig_LiteralVariable_from_PropFile;

import org.springframework.beans.factory.annotation.Value;

public class BaseballCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public String getTeam() {
		return this.team;
	}

}
