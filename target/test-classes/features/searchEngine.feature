@search-engine-test
Feature: Search Engine feature 

Background:
Given I am on the home page of joinallofus.com

@search-engine-test-1
Scenario: Verify search engine functionality


When I click on Search box from top right corner of the home page
And I write "pmi" into search box
And I click on GO button
And I click on Who Can Join – PMI Requirements link
Then I verify page title as "Who Can Join – PMI Requirements | All of Us"