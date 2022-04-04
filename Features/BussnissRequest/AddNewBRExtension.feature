Feature: Add new business Request with source Extension
  Scenario: Test of adding new Business Request with source Extension
    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on button New business request
    And User add a Request number, Framework contract,Service type
    And Choose source Extension
    And fill field Linked BR
    And click on the icon of loading extension
    And click on yes in the sweet alert appeared
    And User click on save of BR
    Then the extension request is saved