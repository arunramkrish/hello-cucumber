package com.abddhospital.bdd.hello_cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
	private String today;
    private String actualAnswer;
    
	@Given("today is Sunday")
	public void today_is_Sunday() {
//	    throw new io.cucumber.java.PendingException();
		today = "Sunday";
	}
	
	@Given("today is Friday")
	public void today_is_Friday() {
	    today = "Friday";
	}
	
	@Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }
	
	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
//	    throw new io.cucumber.java.PendingException();
		actualAnswer = IsItFriday.isItFriday(today);
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String expectedAnswer) {
//	    throw new io.cucumber.java.PendingException();
		assertEquals(expectedAnswer, actualAnswer);
	}
}
