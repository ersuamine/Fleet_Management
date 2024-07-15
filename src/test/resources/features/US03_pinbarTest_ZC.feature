@login @regression @US03
Feature: Learning how to use the pin bar functionality
  Agile story: As a user, I want to learn how to use the pinbar.

  Background: User is already in the log in page
    Given the user is on the login page

  @Ac1
  Scenario Outline: Verify users can see "How To Use Pinbar" and “Use the pin icon on
  the right top corner of page to create  fast access link in the pinbar.”
    Given the user logged in as "<userType>"
    When users click the “Learn how to use this space” link on the homepage
    Then users see “How To Use Pinbar”
    And users see “Use pin icon on the right top corner of page to create fast access link in the pinbar.”

    Examples:
      | userType      |
      | store manager |
      | sales manager |
      | driver        |


  @Ac2
  Scenario Outline: Verify users see an image on the page.
    Given the user logged in as "<userType>"
    When users click the “Learn how to use this space” link on the homepage
    Then users see an image on the page.

    Examples:
      | userType      |
      | store manager |
      | sales manager |
      | driver        |




