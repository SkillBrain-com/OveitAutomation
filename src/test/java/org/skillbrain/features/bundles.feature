@bundle
  Feature: Oveit Bundle Feature

    Scenario: Create a Bundle
      Given I click on the create events button
      When I complete the Overview page
      And I create a new ticket
      When I click on New Bundle button
      And I fill the required fields
      And I click on Save button


#    Scenario: Create a bundle without fields required