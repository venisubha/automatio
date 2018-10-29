@Fblogin
Feature: Login the facebook application

Scenario: Verify user is able to login the application
Given User launch the browser
When User load the facebook application
And User enter the user name 'Dhanapal' for fb
And User enter the password 'XYZ@123' for fb
And User click the login button
And User wait for page load
Then User verifies the recover your account page