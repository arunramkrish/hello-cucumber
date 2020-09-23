@day2
Feature: Scenarios for day2
  We are going to try creating all scenarios for day2 in this feature
  
  Rule: Rule for Group1
  Group1 can place all their scenarios under this rule
  
  Example: Check Group1 basic
  Just a basic check for Gherkin in Group1
  	When I invoke hello cucumber
  	Then I should get "hello cucumber"
    
  Scenario: Check Group1 basic with Scenario
  Just to specify that both Scenario and Example are same
  	When I invoke hello cucumber
  	Then I should get "hello cucumber"
  	
  Scenario: Given a name greet it
  	#Step that will configure the system to be in a well-defined state (pre-condition)
  	#such as creating and configuring objects or adding data to a test database.
  	#Avoid talking about user interaction
  	Given The name "HAH"
  	
  	#Describe an event, or an action. 
  	#This can be a person interacting with the system, or it can be an event triggered by another system
  	When I invoke greet
  	
  	#step should use an assertion to compare the actual outcome (what the system actually does) to the expected outcome (what the step says the system is supposed to do)
  	#An outcome should be on an observable output. That is, something that comes out of the system (report, user interface, message), and not a behaviour deeply buried inside the system (like a record in a database).
  	#Only verify an outcome that is observable for the user (or external system), and changes to a database are usually not.
  	Then I should get "hello HAH"
  
