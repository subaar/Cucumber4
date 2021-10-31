Feature: Application login for Cards payment
Scenario: Home page default login
Given User is on netbanking login page
When user logs in with valid un and pw
Then homepage is displayed
And all cards are displayed