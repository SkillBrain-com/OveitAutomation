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

  @example
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
