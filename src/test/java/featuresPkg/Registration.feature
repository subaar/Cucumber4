Feature: Application Registration for Cards payment
Scenario: Home page default login
Given User is on netbanking login page
When user logs in with valid un and PW
Then homepage is displayed
