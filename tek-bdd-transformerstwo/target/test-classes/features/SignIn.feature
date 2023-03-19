@completeTest
Feature: TEK Retail Application SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @signIn
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'tester9@gmail.com' and password 'Tekstudent123!'
    And User click on login button
    Then User should be logged in into Account

  

	@create
  Scenario: Verify user can create an acount into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email | password  | confirmPassword |
      | fullName | email | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
