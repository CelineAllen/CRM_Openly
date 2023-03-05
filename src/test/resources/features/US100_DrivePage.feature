Feature: Drive page functionality

  Background: user is already in the login page
    Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"

  Scenario: user view all modules in the Drive page

    Given user click on drive button in main page
    Given Verify the users view all modules in the Drive page.
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |





