Feature: Edit Nbr of days of BR FWC(PIP)

  Scenario: User edit Nbr of days of a BR of Type FWC PIP
    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on Search Button
    And User enter the request number in the filter
    And User click on the request
    And User click on edit button
    When User click on button SC Control
    And Click on yes and proceed button
    Then Sc is displayed
