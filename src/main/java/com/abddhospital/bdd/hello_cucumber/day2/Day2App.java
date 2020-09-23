package com.abddhospital.bdd.hello_cucumber.day2;

public class Day2App {
	public String getGreetingMessage() {
		return "hello cucumber";
	}

	public String getGreetingMessage(String subjectToGreet) {
		return "hello " + subjectToGreet;
	}

}