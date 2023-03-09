Feature: Drive page functionality

  Background: User is already in the login page
    Given the user is on the login page
    And the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"

  Scenario: user view all modules in the Drive page

    When user click on drive button in main page
    Then Verify the users view all modules in the Drive page.
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |





