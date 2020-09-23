package com.abddhospital.bdd.hello_cucumber.day2;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	private String greetingMsg;
	private String subjectToGreet;
	
	
	@When("I invoke hello cucumber")
	public void when() throws Throwable {
		greetingMsg = new Day2App().getGreetingMessage();
	}

	@Given("The name {string}")
	public void givenTheSubject(String toGreet) throws Throwable {
		subjectToGreet = toGreet;
	}
	
	@When("I invoke greet")
	public void whenGreetInvoked() throws Throwable {
		greetingMsg = new Day2App().getGreetingMessage(subjectToGreet);
	}

	@Then("I should get {string}")
	public void then(String expectedAnswer) throws Throwable {
		assertEquals(expectedAnswer, greetingMsg);
	}

}
