Feature: Add a new Business Request

  Scenario: : User create Business Request

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
  And User click on save of BR
  Then the request is saved

