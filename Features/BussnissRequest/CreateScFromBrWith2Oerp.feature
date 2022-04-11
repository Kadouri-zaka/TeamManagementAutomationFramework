Feature: Edir Nbr of days of BR FWC(PIP)

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
    And User click on Specific contract button
    And User click on Create SC button
    And User add OERP project code
    And User click on add OERP button
    And User add second OERP project code
    And User click on add OERP button
    And User click on save OERP button
    And User select OERP for each month
    And User click on save asign Oerp
    And User click on save comment button
    Then Sc is created

