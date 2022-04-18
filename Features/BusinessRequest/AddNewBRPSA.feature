  Feature: Add a new BR PSA

    Scenario: User add a new BR
      Given User is already in login page
      When User enter valid username and password
      And user click on login button
      Then User connect successfully
      When User click on Business Request field
      And User click on button New business request
      And User add a Request number,Framework contract,Department,Status,Service type and Source
      When User click on Basic characteristics
      And User add Place of delivery and company
      When User click on New profile button
      And User add Profile,level,on site,sales price, nbr of days and other expertise
      And User click on save of profile
      When User click on Everis candidate
      And User click on new candidate
      And User add First name, Last name, Company, Recruitement, Resource type and Detail interview
      And User click on add button
      When User click on check button
      And click on Select as consultant button
      And User add Type of contract and Employee number
      And User click on save button
      And user click on Profile level consultant button
      And User click on edit button consultant
      And User add consultant cost and click on save button
      And User click on save of BR
      Then the request is saved

