Feature: create event feature

@test
Scenario: create an event in the past
    Given I navigate to Oveit link
    When I login with "valid" credentials
    Then I check user is logged in
    And I click on the create events button
    And I enter the name of this event.
    And I enter a "invalid" start date of this event.
    And I enter a "valid" start time of this event.
    And I enter a "invalid" end date of this event.
    And I enter a "valid" end time of this event.
    And I enter a "valid" location of this event.
    And I click on the Next button
    Then I check user land on Tickets page




