Feature: Openly CRM application Poll functionality

  Agile story: As a user, I should be able to vote for a poll with one answer.
  Users can select one answer and click the “VOTE” button to vote for a poll.


  Background: user is already in the login page
    Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"

    Scenario: user create a one poll
      Given user click poll tab on the home page
      Then user enter the data in to poll body
      Then user enter the question in question box
      Then user enter one answer in first answer box
      Then user enter one answer in second answer box
      Then user click the send button and it create a poll under activity stream

    Scenario: user should be able to vote for a poll with one answer

      Given user should see the poll under the activity stream
      Then user select one answer in the poll
      Then user click the vote button
