Feature: More Tab Functionality

Background: Verify login with given credentials
    #Given the user logged in as "<marketing>"
    Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"

  Scenario: Verify the users view all options under MORE tab
    Given user clicks MORE tab
    And user should see all  options
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |
