Feature: Login functionality
  User story: As a sales manager,I should be able to log in.
@wip_ishak
Scenario Outline: Positive login scenario
  Given salesManager is on the login page of NavFort application
  When salesManager enter username "<username>"
  And salesManager enter password "<password>"
  And salesManager click LOG İN button
  Then salesManager should see the dashboard page
  Examples:
    | username        | password    |
    | salesmanager101 | UserUser123 |
    | salesmanager144 | UserUser123 |
    | salesmanager255 | UserUser123 |
    | salesmanager289 | UserUser123 |


