Feature: Login page steps

  Scenario: Verify title of the login page
    Given I navigate to homepage
    Then Title of the page should be "Interview App"

  @smokeTest @regression
  Scenario: Verify admin can successfully log in with right credentials
    Given I navigate to homepage
    When I input following credentials:
      | email    | admin@yahoo.com |
      | password | admin123        |
    Then I should see "All Topics" dashboard

  @regression
  Scenario: Verify error message is displayed when password is wrong
    Given I navigate to homepage
    When I input following credentials:
      | email    | admin@yahoo.com |
      | password | wrong password  |
    Then I should see error message