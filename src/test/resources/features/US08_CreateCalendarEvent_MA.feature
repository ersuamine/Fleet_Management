@login @regression @US08
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @Ac1
  Scenario Outline: Verify that users see the number “1”
    Given the user logged in as "<userType>"
    And user clicks "Calendar Events" from "Activities" tab
    Then user click the Create Calendar Event button
    And user clicks the Repeat check box
    Then user verifies the number "1" by default in the Repeat Every input option.

    Examples:
      | userType      |
      | store manager |
      | sales manager |
      | driver        |

  @Ac2
  Scenario Outline: Verify that users see error message
    Given the user logged in as "<userType>"
    And user clicks "Calendar Events" from "Activities" tab
    Then user click the Create Calendar Event button
    And user clicks the Repeat check box
    Then user cleared the Calendar event Repeat Every field
    Then user should be able to see "This value should not be blank." error message

    Examples:
      | userType      |
      | store manager |
      | sales manager |
      | driver        |

