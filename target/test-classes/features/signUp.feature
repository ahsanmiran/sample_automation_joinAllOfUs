@sign-up-test
Feature: Sign up feature 

Background:
Given I am on the home page of joinallofus.com

@sign-up-test-1
Scenario: Verify sign up functionality

# Please change the credentials before running the test

When I hover over HOW TO JOIN from menu bar
And I click on GET STARTED - SIGN UP sub menu
And I click on the SUBSCRIBE TO UPDATE link 
Then I got a form with the title "Subscribe to News"
When I write email address "pmo@gmail.com" into Enter email input field
And I write "Brain" into First name input field
And I write "Cebalos" into Last name input field
And I write "00000" into ZIP code input field
And I click on Subscribe button
Then I verify the success message displayed as "Thank You"

