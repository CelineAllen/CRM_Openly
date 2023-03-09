@PRG17-138
Feature: Employee page verification

  Background: user is already in the login page
    Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"


  Scenario: Verify Employee page working as expected
    Given user clicks "Employees" page
    And user should see all modules as expected
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |
      | More                |