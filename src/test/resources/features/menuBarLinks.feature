@sanity
Feature: Menu Bar functionality feature 

Background:
Given I am on home page of joinallofus.com

@sanity-test-1
Scenario: Verify ABOUT menu bar link functionality

When I hover over ABOUT menu from main menu bar
And I click on PROGRAM_OVERVIEW sub menu
Then I verify PROGRAM OVERVIEW page title as "PMI Program Overview - Health Studies | All of Us"


@sanity-test-2
Scenario: Verify ABOUT menu bar link functionality

When I hover over ABOUT menu from main menu bar
And I click on PRIVACY_SAFEGUARDS sub menu
Then I verify PRIVACY SAFEGUARDS page title as "Privacy Safeguards – Protecting Your Health Data | All of Us"

@sanity-test-3
Scenario: Verify ABOUT menu bar link functionality

When I hover over ABOUT menu from main menu bar
And I click on WHO'S_INVOLVED sub menu
Then I verify WHO'S INVOLVED page title as "Who’s Involved – Precision Medicine Initiative | All of Us"

@sanity-test-4
Scenario: Verify ABOUT menu bar link functionality

When I hover over ABOUT menu from main menu bar
And I click on FAQ sub menu
Then I verify FAQ page title as "FAQ – Precision Medicine FAQ | All of Us"

@sanity-test-5
Scenario: Verify HOW TO JOIN menu bar link functionality

When I hover over HOW TO JOIN menu from main menu bar
And I click on GET_STARTED-SIGN_UP sub menu
Then I verify GET STARTED-SIGN UP page title as "Get Started – Sign Up Precision Medicine Initiative | All of Us"

@sanity-test-6
Scenario: Verify HOW TO JOIN menu bar link functionality

When I hover over HOW TO JOIN menu from main menu bar
And I click on WHO_CAN_JOIN sub menu
Then I verify WHO CAN JOIN page title as "Who Can Join – PMI Requirements | All of Us"

@sanity-test-7
Scenario: Verify HOW TO JOIN menu bar link functionality

When I hover over HOW TO JOIN menu from main menu bar
And I click on WHAT_YOU_WOULD_NEED_TO_DO sub menu
Then I verify WHAT YOU WOULD NEED TO DO page title as "What Would You Need to Do – PMI Program Requirements | All of Us"

@sanity-test-8
Scenario: Verify HOW TO JOIN menu bar link functionality

When I hover over HOW TO JOIN menu from main menu bar
And I click on BENEFITS_OF_TAKING_PART sub menu
Then I verify BENEFITS OF TAKING PART page title as "Benefits of Taking Part – Precision Medicine Initiative | All of Us"

@sanity-test-9
Scenario: Verify HOW TO JOIN menu bar link functionality

When I hover over HOW TO JOIN menu from main menu bar
And I click on HOW_YOUR_DATA_WILL_BE_USED sub menu
Then I verify HOW YOUR DATA WILL BE USED page title as "How Your Data Will Be Used – Precision Medicine Initiative | All of Us"

@sanity-test-10
Scenario: Verify HOW TO JOIN menu bar link functionality

When I hover over HOW TO JOIN menu from main menu bar
And I click on VISIT_AN_ALL_OF_US_PARTNER_LOCATION sub menu
Then I verify VISIT AN ALL OF US PARTNER LOCATION page title as "Find a Partner Location – Precision Medicine Initiative | All of Us"

@sanity-test-11
Scenario: Verify NEWS & EVENTS menu bar link functionality

When I hover over NEWS & EVENTS menu from main menu bar
And I click on EVENTS sub menu
Then I verify EVENTS page title as "Events - Precision Medicine Initiative | All of Us"

@sanity-test-12
Scenario: Verify NEWS & EVENTS menu bar link functionality

When I hover over NEWS & EVENTS menu from main menu bar
And I click on DIRECTORS_CORNER sub menu
Then I verify DIRECTORS CORNER page title as "Director’s Corner – Eric Dishman | All of Us"

@sanity-test-13
Scenario: Verify COMMUNITY menu bar link functionality

When I click on COMMUNITY menu from main menu bar
Then I verify COMMUNITY page title as "Participant Community – Community Health | All of Us"

@sanity-test-14
Scenario: Verify LOG IN menu bar link functionality

When I click on LOG_IN menu from main menu bar
Then I verify LOG IN page title as "Hi!"
