Feature: Access BR from SC Control

  Scenario: User access Br from Sc Control

    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    When User click on Sc Control
    And User click on T&M control
    And User click search button
    And User add a Request number in filter
    And User click on Request in grid
    And User click on edit Sc button
    And User click on Business Request button
    Then Business Request page is opened
