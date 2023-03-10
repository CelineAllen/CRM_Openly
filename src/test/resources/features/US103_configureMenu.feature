Feature: Configure Menu


  Background: user is already in the login page
    Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"
  @wip
  Scenario: Verify all options are present and accessible
    Given user navigates to configure menu
    Then user click on configure menu
    And user is able to see Configure Menu Items option and click on it
    And user is able to see Collapse menu option and click on it

    And user is able to see Add custom menu item option and click on it
    And user is able to see Change primary tool option and click on it
    And user is able to see Remove current page from left menu option and click on it
    And user is able to see Reset menu option and click on it









