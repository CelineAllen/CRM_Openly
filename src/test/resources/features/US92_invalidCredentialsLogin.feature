Feature: login with invalid credentials

  Scenario: user enters invalid credentials and sees the error message
    Given user enters invalid credentials
    Given  Incorrect username or password should be displayed when a user enters the wrong username or password.

