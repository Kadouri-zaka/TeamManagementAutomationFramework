Feature: Delete Bussniss Request

  Scenario: User delete a BR

    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on Search Button
    And User enter the request number in the filter
    And User click on the request
    When User click on remove button
    And User Click on yes button
    Then BR is deleted
