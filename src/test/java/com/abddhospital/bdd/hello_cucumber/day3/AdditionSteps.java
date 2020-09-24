package com.abddhospital.bdd.hello_cucumber.day3;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdditionSteps {
	private int firstNum;
	private int secondNum;
	private int sum;
	
	@Given("first number is {int}")
	public void givenTheFirstNumber(int firstNum) throws Throwable {
		this.firstNum = firstNum;
	}
	
	@Given("second number is {int}")
	public void givenTheSecondNumber(int secondNum) throws Throwable {
		this.secondNum = secondNum;
	}
	
	@When("user executes sum function")
	public void when() throws Throwable {
		sum = new Calculator().add(firstNum, secondNum);
	}

	@Then("the sum is {int}")
	public void then(int expectedAnswer) throws Throwable {
		assertEquals(expectedAnswer, sum);
	}

}
