@login
Feature: Oveit Login Feature

  Scenario: Login with valid credentials
    Given I navigate to Oveit link
    When I login with "valid" credentials
    Then I check user is logged in

  Scenario: Login with invalid credentials
    Given I navigate to Oveit link
    When I login with "invalid" credentials
    Then The login error message is displayed

  Scenario: Login with empty credentials
    Given I navigate to Oveit link
    When I fill in email field with ""
    And I fill in password with ""
    And I click on login button
    Then I verify the following email error message is displayed: "The field is required"
    And I verify the following password error message is displayed: "The field is required"

  Scenario: Login with invalid email address
    Given I navigate to Oveit link
    When I fill in email field with "abc"
    And I fill in password with ""
    And I click on login button
    Then I verify the following email error message is displayed: "Invalid email address"
    And I verify the following password error message is displayed: "The field is required"

  Scenario Outline: Login test scenarios
    Given I navigate to Oveit link
    When I login with <credentials> credentials
    And I login with <action> credentials
    Then I check user is logged in

    Examples:
      | credentials | action |
      | "valid"     | "do"   |
      | "invalid"   | "don't |
      | ""          | do not |
