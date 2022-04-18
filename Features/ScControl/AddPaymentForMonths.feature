Feature: Add payment for months

  Scenario: User add invoice for number of payment that he wants in Sc control

    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Sc Control
    And User click on T&M control
    And User click search button
    And User add a Request number in filter
    And User click on Request in grid
    And User click on edit Sc button
    When User click on performance button
    And User select month required
    And User click on process for payment button
    And User click on consultant payment process
    And User add add all required field in consultant payment process pop-up
    And User click on save consultant payment process button
    And User click on save edit SC
    And User click on add comment button
    Then Payment is added successfully
