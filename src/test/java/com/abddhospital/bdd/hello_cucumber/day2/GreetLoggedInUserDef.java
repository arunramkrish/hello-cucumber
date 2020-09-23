package com.abddhospital.bdd.hello_cucumber.day2;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.abddhospital.bdd.hello_cucumber.day2.model.User;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreetLoggedInUserDef {
	private String firstName;
	private String lastName;
	private String title;
	private String greetingMsg;
	private User currentUser;
	
	@Given("The logged in user first name is {string} and last name is {string} and title is {string}")
	public void givenTheSubject(String firstName, String lastName, String title) throws Throwable {
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
	}
	
	@Given("The logged in user first name is {string}")
	public void givenTheFirstName(String firstName) throws Throwable {
		this.firstName = firstName;
	}
	
	@Given("last name is {string}")
	public void givenTheLastName(String lastName) throws Throwable {
		this.lastName = lastName;
	}
	
	@Given("title is {string}")
	public void givenTheTitle(String title) throws Throwable {
		this.title = title;
	}
	
	@Given("The logged in user is")
	public void givenUserInDataTable(DataTable dataTable) throws Throwable {
		User user = dataTable.convert(User.class, false);
//		List<List<String>> data = dataTable.asLists();
		
//		this.firstName = data.get(0).get(1).toString();
//		this.lastName = data.get(1).get(1).toString();
//		this.title = data.get(2).get(1).toString();		
		this.currentUser = user;
	}
	
	@When("I invoke greet logged in user")
	public void whenGreetInvoked() throws Throwable {
		
		greetingMsg = (currentUser == null) ? new Day2App().getGreetingMessage(firstName, lastName, title) : new Day2App().getGreetingMessage(currentUser);
	}

	@Then("I should get user name as {string}")
	public void then(String expectedAnswer) throws Throwable {
		assertEquals(expectedAnswer, greetingMsg);
	}

}
