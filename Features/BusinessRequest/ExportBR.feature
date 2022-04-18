Feature: Export all document

  Scenario: User export all BR to a document

    Given User is already in login page
    When User enter valid username and password
    And user click on login button
    Then User connect successfully
    When User click on Business Request field
    And User click on Search Button
    And user click on Export all button
    Then All BR are exported
