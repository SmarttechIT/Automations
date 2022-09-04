Feature: User able to login with valid username and password
Scenario: User login with valid username, password varify the page title

Given User able to open any browser 
Given User able to enter the URL

When User able to click on Signin button
When User able to enter the Username 
When User able to enter the PW
When User able to click on submit button

Then User able to login in susscessfully
Then User able to verify the page title


