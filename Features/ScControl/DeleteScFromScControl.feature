
Feature: Delete Sc from SC Control

  Scenario: User delete Sc from Sc Control

    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    When User click on Sc Control
    And User click on T&M control
    And User click search button
    And User add a Request number in filter
    And User click on Request in grid
    And User click on remove request button
    And User click on yes delete button
    And User click on ok button
    Then Sc is deleted successfully
