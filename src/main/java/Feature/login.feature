Feature: Free CRM Login Feature 
Scenario Outline: Free CRM Login Feature Test 
	Given User is already on login page 
	When title of login page is Free CRM 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login button 
	Then user is on home page 
	
	Examples: 
		|username | password|
		|nerella.rajith97@gmail.com|Test@123|