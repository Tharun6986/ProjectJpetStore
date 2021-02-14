Feature: Registering new user
Scenario: Register user with valid credentials
Given the user is in the registration page
When the user wants to register with his credentials
Then he registers and logs in

Scenario: Register user with invalid credentials
Given the user is in the registration page
When the user enters invalid repeat password
Then system throws an error1 message

Scenario: Register user with invalid credentials
Given the user is in the registration page
When the user enters invalid mail id
Then system throws an error2 message

Scenario: Register user with invalid credentials
Given the user is in the registration page
When the user enters invalid address
Then system throws an error3 message
