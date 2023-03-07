@B28G17-113
Feature: OpenlyCRM login page features

  Agile story: As a user, when I am on the OpenlyCRM login page
  I should be able to check the "Remember me on this computer" checkbox

  Background: For all scenarios user is on the login page of the OpenlyCRM application
    Given user is on the login page of the OpenlyCRM application

  @B28G17-113
  Scenario Outline: "Remember me on this computer" checkbox feature for HelpDesk
    When user enter "<username>" and "<password>"
    Then user can check the "Remember me on this computer" checkbox
    And User can click the LogIn button

    Examples:
      | username                       | password |
      | hr19@cybertekschool.com        | UserUser |
      | hr8@cybertekschool.com         | UserUser |
      | hr2@cybertekschool.com         | UserUser |
      | marketing11@cybertekschool.com | UserUser |
      | marketing27@cybertekschool.com | UserUser |
      | marketing38@cybertekschool.com | UserUser |
      | helpdesk4@cybertekschool.com   | UserUser |
      | helpdesk10@cybertekschool.com  | UserUser |
      | helpdesk15@cybertekschool.com  | UserUser |