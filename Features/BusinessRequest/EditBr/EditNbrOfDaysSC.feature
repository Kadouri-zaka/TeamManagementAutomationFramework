Feature: Edir Nbr of days of BR FWC(PIP)

  Scenario: User edit Nbr of days of a BR of Type FWC PIP with Sc
    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on Search Button
    And User enter the request number in the filter
    And User click on the request
    And User click on edit button
    When User click on Basic characteristics
    And user click on edit profile button
    And User edit Nbr of days
    And user click on save edit profile button
    And User click on save of BR
    And User click on save comment button
    Then Nbr of days is changed successfully