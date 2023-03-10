Feature: Chat and Calls module in OpenlyCRM application

  Agile story: As a user, I should be able to access the Chat and Calls module.
  There should be four sub-modules once the user clicks the Chat and Calls module:
  Message, Notifications, Settings, Active Stream

  Background: user is already in the login page
    Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"


  Scenario: Verify access to Chat and Calls module and its sub-modules
    Given User can click the Chat and Calls tap on the right side taps
    Then user sees sub modules below
      | Message(s)      |
      | Notifications   |
      | Settings        |
      | Activity Stream |
