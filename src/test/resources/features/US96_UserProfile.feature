@profile
Feature: Five options should be displayed under the user profile

  Background: user is already in the login page
    Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"

  Scenario: user click profile and view five options under the user profile


    And user click on  profile
    Then Verify five options under profile
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |