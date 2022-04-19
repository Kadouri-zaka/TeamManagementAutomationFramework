Feature: Add new BR POF

  Scenario: User add new BR with service type Provision of services
    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on button New business request
    And User add a Request number,Framework contract,Department,Status,Service type and Source
    When User click on Basic characteristics
    And User add Place of delivery and company
    And User add total man days
    When User click on New profile button
    And User add Profile,level,on site,sales price, nbr of days and other expertise
    And User click on save of profile
    When User click on new consultant button
    And User add first name and last name
    And User click on save consultant button
    And User click on edit consultant button
    And User select profile
    And User click on save edit consultant button
    And User click on save of BR
    Then the request is saved