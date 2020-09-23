package com.abddhospital.bdd.hello_cucumber.day2;

import com.abddhospital.bdd.hello_cucumber.day2.model.User;

public class Day2App {
	public String getGreetingMessage() {
		return "hello cucumber";
	}

	public String getGreetingMessage(String subjectToGreet) {
		return "hello " + subjectToGreet;
	}

	public String getGreetingMessage(String firstName, String lastName, String title) {
		return title + " " + firstName + ((lastName != null && lastName != "") ? (" " + lastName) : "");
	}

	public String getGreetingMessage(User currentUser) {
		
		return getGreetingMessage(currentUser.getFirstName(), currentUser.getLastName(), currentUser.getTitle());
	}
	
}