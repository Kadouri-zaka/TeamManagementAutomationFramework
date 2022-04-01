
Feature: Create Sc from SC Control

  Scenario: User create Sc from Sc Control

    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    When User click on Sc Control
    And User click on T&M control
    And User click on new sc control button
    And User add a Request number
    And User click on T&M control button
    And User add OERP PROJECT CODE
    And User click on add button for OERP Projet code
    And User Click on save New SC Button
    And User click on ok button
    Then Sc is created successfully
