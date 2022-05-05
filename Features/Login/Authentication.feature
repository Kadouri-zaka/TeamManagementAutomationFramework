Feature: Login page

Scenario: User connect to login page

  Given User is already in login page
    When User enter valid username and password
    And user click on login button
   Then User is redirected to the home page

