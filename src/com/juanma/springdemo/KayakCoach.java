package com.juanma.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("waterCoach")
public class KayakCoach implements Coach {
	
	@Autowired
	@Qualifier("randomService")
	private FortuneService fs;
	
	
	public KayakCoach() {

	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Go to the river and row for an hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
