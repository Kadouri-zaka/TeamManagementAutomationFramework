Feature: Add a new Business Request

  Scenario Outline: : User create Business Request

    Given User is in login page
    When User enter username as <username> and password as <password>
    And user click on the login button
    Then User is redirected to the home page
    When User click on Business Request field
    And User click on button New business request
    And User add a Request number, Framework contract as <Framework contract>,Department as <Department>,Status as <Status>,Service type as <Service type> and Source as <Source> and linked BR as <linked BR>
    When User click on Basic characteristics
    And User add Place of delivery as <Place of delivery> and company as <company>
    When User click on New profile button
    And User add Profile as <Profile>,level as <level>,on site as <on site>,sales price as <sales price>, nbr of days as <nbr of days> and other expertise as <expertise>
    And User click on save of profile
    And User click on save of BR
    Then Business Request  is added

    Examples:
      | username |  | password                |  | Framework contract |  | Department |  | Status                  |  | Service type |  | Source  |  | Place of delivery |  | company     |  | Profile    |  | level  |  | on site |  | sales price |  | nbr of days |  | expertise     |
      | Admin    |  | ALKmioksfghQesNmlIompfn |  | Axa                |  | Axa        |  | Order in Progress (OiP) |  | TM           |  | Initial |  | LUX               |  | everis EBEL |  | Consultant |  | Unique |  | On site |  | 100         |  | 250         |  | java selenium |
                            