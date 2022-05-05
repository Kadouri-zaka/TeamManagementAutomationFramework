Feature: Login page

Scenario Outline: User connect to login page

Given User is in login page
When User enter username as <username> and password as <password>
And user click on the login button
  Then User is redirected to the home page

Examples:
|username| |password|
|Admin   | |ALKmioksfghQesNmlIompfn|
|Admin   | |test                   |




