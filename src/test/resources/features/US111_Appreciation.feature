Feature: Appreciation message

  Background: user is already in the login page
    Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"

    @PRG17-140
    Scenario: user should able to make Appreciation message
      Given user clicks Message button
      And user writes "You did great!"
      And user clicks SEND button
      Then message should display

      @PRG17-141
    Scenario: user should see negative message
      Given user clicks Message button
      And user clicks SEND button
      Then user should see "The message title is not specified" message