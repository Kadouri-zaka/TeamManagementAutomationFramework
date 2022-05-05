Feature: Add Credit Note

  Scenario: User add credit note for an invoiced month with modification in invoice day

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
    When User click on invoicing button
    And User double click on month to generate credit note
    And User click on generate credit note button
    And User choose Apply concesion
    And User add OERP invoice code for credit note
    And User click on details
    And User add Nbr of days to credit
    And User click on save credit note
    And User click on yes button to change day
    Then User check if number of days is changed in performance