package com.juanma.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	private String[] lucks = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck", "The journey is the reward"};
	private Random r = new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return lucks[r.nextInt(lucks.length)];
	}

}
