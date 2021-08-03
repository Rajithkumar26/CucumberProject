Feature: Free CRM Contacts Feature 
Scenario Outline: Free CRM contacts Feature Test 
	Given User is already on login page 
	When title of login page is Free CRM 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login button 
	Then user is on home page 
	Then user enters contacts page 
	Then User can creates contacts "<Firstname>" and "<Lastname>" 
	Then Close the Browser 
	Examples: 
		|username                  |password|Firstname  |Lastname|
		|nerella.rajith97@gmail.com|Test@123|Vaibhavi  |Yeswi|
		|nerella.rajith97@gmail.com|Test@123|Shankar |Daada|