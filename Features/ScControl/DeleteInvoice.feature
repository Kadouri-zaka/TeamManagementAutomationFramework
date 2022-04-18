Feature: Delete invoice for months

  Scenario: User delete invoice before save in Sc control

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
    When User click on performance button
    And User select month required
    And User click on generate invoice
    And User click on client invoice
    And User add OERP invoice code
    And click on save client invoice
    And User click on delete invoice buton
    Then Invoice is deleted successfully
