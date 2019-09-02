package com.juanma.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach kayakCoach = context.getBean("waterCoach",Coach.class);
		
		// call method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(kayakCoach.getDailyWorkout());
		
		// get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();

	}

}
