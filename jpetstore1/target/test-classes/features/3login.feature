Feature: User logging in
Scenario: User logging in with valid credentials
Given user in the login page
When user wants to login with valid credentials
Then user logs in


Scenario: User logging in with invalid username 
Given user in the login page
When User login with invalid username 
Then system throws an errorso message

Scenario: User logging in with invalid password
Given user in the login page
When User login with invalid password
Then system throws an errorthere message

Scenario: User logging in with empty fields
Given user in the login page
When User login with empty fields
Then system throws an errorhere message