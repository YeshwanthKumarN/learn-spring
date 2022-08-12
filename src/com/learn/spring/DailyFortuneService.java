package com.learn.spring;

public class DailyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		
		return "It's your Lucky day ";
	}

}
