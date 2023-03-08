Feature: User should be able to see desktop options to download

  Background: user is already in the login page
    Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"

  Scenario: Verify desktop options to download
    Given User should scroll down
    Then User should see "desktop client"
    Then User should see below options
      | MAC OS  |
      | WINDOWS |
      | LINUX   |

