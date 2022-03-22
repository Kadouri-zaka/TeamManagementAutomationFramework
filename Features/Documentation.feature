Feature: Documentation
  Scenario: User add a document in documentation
    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on button New business request
    And User click on documentation button
    And user click on button to upload file
    And User choose document type
    Then User click on save of BR
    And User click on save comment button

