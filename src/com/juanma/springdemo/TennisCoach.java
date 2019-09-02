package com.juanma.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	@Value("${team}")
	private String teamName;
	
	public TennisCoach() {
		System.out.println("TennisCoach constructor called" );
	}
	
	@PostConstruct
	public void afterInitMethod() {
		System.out.println("Team Name: " + this.teamName);
	}
	
	@PreDestroy
	public void beforeRemoval() {
		System.out.println("Tennis coach is going to be destroyed");
	}
	
	/**
	@Autowired
	public void autowiredDoesntHaveToBeASetterItJustNeedsTheAutowiredAnnotation(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}**/

	/**
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}**/
	
	@Override
	public String getDailyWorkout() {
		
		return "Practica en la pista 3 durante 5 horas";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
