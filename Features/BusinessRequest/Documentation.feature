Feature: Documentation
  Scenario: User add a document in documentation
    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on Search Button
    And User enter the request number in the filter
    And User click on the request
    And User click on edit button
    And User click on documentation button
    And user click on button to upload file
    And User choose document type
    Then User click on save of BR
    And User click on document save comment button
    Then Document is added successfully

