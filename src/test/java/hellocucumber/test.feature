Feature: Click on radio button
  User wants to click on radio button

  Scenario: Simple scenario to click on radio button
    Given I am on ruby watir page
    And I click on "Radio1"
    And I click on "Radio with class"
    And I click on "Radio with id"
    And I click on "Radio with name"
    And I click on "Radio5"
    And I click on "Radio6"
    And I close the browser