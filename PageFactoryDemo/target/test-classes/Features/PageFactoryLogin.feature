#Gokul kanan
#10/7/24

Feature: Login page automation of Saucedemo application
	
	Scenario: check login is succesful with valid credentials
	
		Given User is on login page
	  When user enters valid "<username>" and "<password>"
		And clicks in the login button
		Then user is navigated to the home page
		And close the browser
		
	Examples:
	| username | password |
	| standard_user | secret_sauce |
   