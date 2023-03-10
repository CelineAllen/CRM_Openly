Feature: OpenlyCRM logout features

  Agile story: As a user, I should be able to log out from the CRM app.
  The “Log out” option should be displayed when the user clicks the user profile from the homepage
  then the user should navigate back to the login page.

  Background: user is already in the login page
    Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"


  Scenario: User should be able to log out from the CRM app.
    Given User click the user profile button on the top right corner
    Then the Log Out option should be displayed then user should navigate back to the login page