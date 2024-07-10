@login @regression @US03
Feature: Learning how to use the pin bar functionality

  Background: User is already in the log in page
    Given the user is on the login page

  @AC1
  Scenario Outline:
    When "<userType>" click the “Learn how to use this space” link on the homepage
    Then users see “How To Use Pinbar”
    And users see “Use pin icon on the right top corner of page to create fast access link in the pinbar.”

    Examples:
      | userType      |
      | store manager |
      | sales manager |
      | driver        |


