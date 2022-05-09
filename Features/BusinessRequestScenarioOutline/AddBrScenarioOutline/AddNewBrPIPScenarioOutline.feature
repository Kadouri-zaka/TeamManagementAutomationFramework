Feature: add new BR PIP
  Scenario: User create new BR with FWC PIP

    Given User is in login page
    When User enter username as <username> and password as <password>
    And user click on the login button
    Then User is redirected to the home page
    When User click on Business Request field
    And User click on button New business request
    And User add a Request number, Framework contract as <Framework contract>,Department as <Department>,Status as <Status>,Service type as <Service type> and Source as <Source>
    When User click on Basic characteristics
    And User add Place of delivery as <Place of delivery> and company as <company>
    And User add total man days as <total man days>
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

    When User click on Specefic contract button
    And User add Specific contract number as <contract number>, Date SC is received as <Sc received>, Date SC is signed as <Sc is signed >,and Maximum end date as <end date>
    When User click on work order
    And User click on edit profile button
    And User add sent to customer as <sent to customer>, Date proposal is submitted to customer as <submitted to customer> , Acceptance date as <acceptance date> , Date FO is submitted to customer as <FO submitted to customer>
    And User click on save edit work order button
    When User click on Basic characteristics
    And user click on Profile level consultant button
    And User click on edit button consultant
    And User add consultant cost as <consultant cost> and click on save button
    And User click on save of BR
    Then Business Request with Status PIP is added
