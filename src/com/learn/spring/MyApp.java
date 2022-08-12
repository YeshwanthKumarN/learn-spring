package com.learn.spring;

public class MyApp {

	public static void main(String[] args) {

		Coach coach = new BaseballCoach();
		System.out.println(coach.getDailyWorkout());
		coach = new CricketCoach();
		System.out.println(coach.getDailyWorkout());

	}

}
