Feature: Create SC from BR with 2 OERP

  Scenario: User create sc from BR with 2 OERP
    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on Search Button
    And User enter the request number in the filter
    And User click on the request
    And User click on edit button
    And User click on Specific contract button
    And User click on Create SC button
    And User add first OERP project code
    And User click on add OERP button
    And User add second OERP project code
    And User click on add OERP button
    And User click on save OERP button
    And User select OERP for each month
    And User click on save asign Oerp
    Then Sc is created

