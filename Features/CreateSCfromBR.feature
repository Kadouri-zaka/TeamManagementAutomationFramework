Feature: Create Sc from BR

  Scenario: User create sc from BR

    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on Search Button
    And User enter the request number in the filter
    And User click on the request
    When User click on edit button
    And User click on Specific contract button
    And User click on Create SC button
    And User add OERP project code
    And User click on add OERP button
    And User click on save OERP button
    Then Sc is created