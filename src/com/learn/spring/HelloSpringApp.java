package com.learn.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load Application Context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans
		Coach theCoach = context.getBean("myBaseballCoach", Coach.class);
		
		//Log retrieved bean's method response
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();
	}

}
