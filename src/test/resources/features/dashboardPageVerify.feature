Feature: Validate the Breadcrumb, Page Heading, and
  Page Title of the 'Dashboard' Page after successful login (according to the screenshots)

  @wip_ishak
  Scenario Outline: Dashboard page verification
    Given salesManager is on the login page of NavFort application
    When salesManager enter username "<username>"
    And salesManager enter password "<password>"
    And salesManager click LOG İN button
    Then salesManager should see the Breadcrumb, Page Heading and Page Title of the Dashboard Page
    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | salesmanager144 | UserUser123 |
      | salesmanager255 | UserUser123 |
      | salesmanager289 | UserUser123 |