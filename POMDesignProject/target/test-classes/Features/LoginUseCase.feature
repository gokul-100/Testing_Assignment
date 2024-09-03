#Gokul kannan
#11/07/2024

Feature: Login Page automation of saucedemo application

		Scenario: Check login is successful with valid credentials

Given User is our login page
When User enters valid "<username>" and "<password>"
And clicks on login button
Then user is navigated to the home page
And Close the browser


Examples:
| username | password |
| standard_user | secret_sauce |