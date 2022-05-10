Feature: Add a new BR PSA

  Scenario Outline: User add a new BR PSA
    Given User is in login page
    When User enter username as <username> and password as <password>
    And user click on the login button
    Then User is redirected to the home page
    When User click on Business Request field
    And User click on button New business request
    And User add a Request number, Framework contract as <Framework contract>,Department as <Department>,Status as <Status>,Service type as <Service type> and Source as <Source>
    When User click on Basic characteristics
    And User add Place of delivery as <Place of delivery> and company as <company>
    When User click on New profile button
    And User add Profile as <Profile>,level as <level>,on site as <on site>,sales price as <sales price>, nbr of days as <nbr of days> and other expertise as <expertise>
    And User click on save of profile
    When User click on Everis candidate
    And User click on new candidate
    And User add First name as <first name>, Last name as <last name>, Company as <company>, Recruitement as <recuitement>, Resource type as <resource type> and Detail interview as <detail interview>
    And User click on add button
    When User click on check button
    And click on Select as consultant button
    And User add Type of contract as <type of contract> and its required field as <required field>
    And User click on save button
    And user click on Profile level consultant button
    And User click on edit button consultant
    And User add consultant cost as <consultant cost>,type of involvement as <type involvement>, required field as <required field involvement> and click on save button
    When User click on work order
    And User click on edit profile button
    And User add sent to customer as <sent to customer>, Date proposal is submitted to customer as <submitted to customer> , Acceptance date as <acceptance date> , Date FO is submitted to customer as <FO submitted to customer>
    And User click on save edit work order button
    When User click on other information button
    And User add total price as <total price>
    And User click on save of BR
    Then Business Request with Status PSA is added


    Examples:
      | username |  | password                |  | Framework contract |  | Department |  | Status                            |  | Service type |  | Source  |  | Place of delivery |  | company     |  | Profile    |  | level  |  | on site |  | sales price |  | nbr of days |  | expertise     |  | first name |  | last name |  | company     |  | recuitement |  | resource type |  | detail interview |  | type of contract |  | required field |  | consultant cost |  | type involvement  |  | required field involvement |  | sent to customer |  | submitted to customer |  | acceptance date |  | FO submitted to customer |  | total price |
      | Admin    |  | ALKmioksfghQesNmlIompfn |  | CASIS Lot 1        |  | AGRI       |  | Pending signature Agreement (PSA) |  | QTM          |  | Initial |  | LUX               |  | everis EBEL |  | AA         |  | Junior |  | On site |  | 100         |  | 250         |  |               |  | test       |  | test      |  | everis EBEL |  | Belen Ruiz  |  | Recruitment   |  | good             |  | Subcontractor    |  | Atos           |  | 150             |  | By amount         |  | 1500                       |  | 09/05/2022       |  | 09/05/2022            |  | 09/05/2022      |  | 30/08/2022               |  |             |
      | Admin    |  | ALKmioksfghQesNmlIompfn |  | Axa                |  | Axa        |  | Pending signature Agreement (PSA) |  | TM           |  | Initial |  | LUX               |  | everis EBEL |  | Consultant |  | Unique |  | On site |  | 100         |  | 250         |  | java selenium |  | test       |  | test      |  | everis EBEL |  | Belen Ruiz  |  | Recruitment   |  | good             |  | Employee         |  | 99868          |  | 150             |  |                   |  |                            |  |                  |  |                       |  |                 |  |                          |  |             |
      | Admin    |  | ALKmioksfghQesNmlIompfn |  | CASIS Lot 1        |  | AGRI       |  | Pending signature Agreement (PSA) |  | QTM          |  | Initial |  | LUX               |  | everis EBEL |  | AA         |  | Junior |  | On site |  | 100         |  | 250         |  | java selenium |  | test       |  | test      |  | everis EBEL |  | Belen Ruiz  |  | Recruitment   |  | good             |  | Freelance        |  |                |  | 150             |  | By number of days |  | 100                        |  | 09/05/2022       |  | 09/05/2022            |  | 09/05/2022      |  | 30/08/2022               |  |             |
      | Admin    |  | ALKmioksfghQesNmlIompfn |  | CASIS Lot 1        |  | AGRI       |  | Pending signature Agreement (PSA) |  | QTM          |  | Initial |  | LUX               |  | everis EBEL |  | AA         |  | Junior |  | On site |  | 100         |  | 250         |  | java selenium |  | test       |  | test      |  | everis EBEL |  | Belen Ruiz  |  | Recruitment   |  | good             |  | Freelance        |  |                |  | 150             |  | By percentage     |  | 20                         |  | 09/05/2022       |  | 09/05/2022            |  | 09/05/2022      |  | 30/08/2022               |  |             |



