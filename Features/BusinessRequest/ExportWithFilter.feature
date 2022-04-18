Feature: Export all document with filter

  Scenario: User export all BR to a document with filter

    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on Search Button
    And User add filter required in filter field
    And User Click on grid menu
    And User click on Export all data with filter
    Then All BR are exported
