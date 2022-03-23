Feature: Add new BR FP

  Scenario: User add new BR with service type FP
    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on button New business request
    And User add a Request number, Framework contract, Department, Status, Service type,Source
    When User click on Basic characteristics
    And User add Place of delivery , company
    And User add total man days
    When User click on New profile button
    And User add Profile , level , on site , sales price, nbr of days other expertise
    And User click on save of profile
    When User click on Everis condidate
    And User click on new condidate
    And User add Fisrt name, Last name, Company, Recruitement, Resource type, Detail interview
    And User click on add button
    When User click on check button
    And click on Select as consultant button
    And User add Type of contract and Employee number
    And User click on save button
    When User click on other information button
    And User add total price
    When User click on Specefic contract button
    And User add Specific contract number, Date SC is received, Date SC is signed, Project start date  and Maximum end date
    When User click on work order
    And User click on edit profile button
    And User add sent to customer, Date proposal is submitted to customer , Acceptance date , Date FO is submitted to customer
    And User click on save edit work order button
    When User click on Basic characteristics
    And user click on Profile level consultant button
    And User click on edit button consultant
    And User choose type of involement and field required
    And User click on edit consultant save button
    And User click on save of BR
    Then the request is saved
