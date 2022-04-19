Feature: Add subcontractor

  Scenario: User add subcontractor in a BR

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
    And User click on subcontractor button
    And User click on new subcontractor button
    And User choose subcontractor and type of involevement
    And User click on add Subcontractor button
    And User click on save of BR
    And User click on comment save button
    Then Subcontractor is added successfully