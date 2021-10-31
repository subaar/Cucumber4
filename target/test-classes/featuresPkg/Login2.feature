Feature: Application login for Cards payment
Scenario: Home page default login ok
Given User is on netbanking login page
When user logs in with valid un and pw
Then homepage is displayed fine
And all cards are displayed