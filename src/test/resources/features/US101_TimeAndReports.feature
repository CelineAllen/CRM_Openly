@TimeAndReports
Feature: Time and Reports page
  Agile story: As a user, I want to access the Time and Reports page
  I should be able to view all modules in the Time and Reports page

  @B28G17-124
  Scenario: Time and Reports page modules as Marketing
    Given the user logged in with username as "marketing27@cybertekschool.com" and password as "UserUser"
    When user click on "Time and Reports" button in main page
    Then Verify the users view all modules in the Time and Reports page
      | Absence Chart          |
      | Worktime               |
      | Bitrix24.Time          |
      | Work Reports           |
      | Meetings and Briefings |

  @B28G17-125
  Scenario: Time and Reports page modules as Help Desk
    Given the user logged in with username as "helpdesk4@cybertekschool.com" and password as "UserUser"
    When user click on "Time and Reports" button in main page
    Then Verify the users view all modules in the Time and Reports page
      | Absence Chart          |
      | Worktime               |
      | Bitrix24.Time          |
      | Work Reports           |
      | Meetings and Briefings |


    @B28G17-126
  Scenario: Time and Reports page modules as Human Resources
    Given the user logged in with username as "hr8@cybertekschool.com" and password as "UserUser"
    When user click on "Time and Reports" button in main page
    Then Verify the users view all modules in the Time and Reports page
      | Absence Chart          |
      | Worktime               |
      | Bitrix24.Time          |
      | Work Reports           |
      | Meetings and Briefings |
