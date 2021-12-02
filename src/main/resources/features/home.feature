Feature: Home page scenarios

  Background:
    Given I navigate to homepage
    And Login with "admin" credentials

  @regression
  Scenario Outline: Verify all dashboards are displayed
    Then I should see dashboard "<dashboard name>"
    Examples:
      | dashboard name |
      | All Topics     |
      | Coding         |
      | Soft Skills    |

  @regression
  Scenario: Verify Like Button is increasing number of likes
    When I capture number of likes of the last statement
    And Click on "Like" button of the the last statement
    Then Number of likes should increase by 1

  @smoke @regression
  Scenario: Verify user can add a statement
    When I add a statement "Test Statement"
    Then I should be see "Test Statement" on the page