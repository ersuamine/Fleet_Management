@regression @US09 @B34G13-173
Feature: user should see error messages when user enter an invalid integer number

  Background: User is already in the log in page
    #@B34G13-138
    Given the user is on the login page

  @Ac1 @B34G13-171
  Scenario Outline: Verify that users see error messages when enter invalid integers.
    Given the user logged in as "<userType>"
    When user clicks "Calendar Events" from "Activities" tab
    And user click the Create Calendar Event button
    Then user clicks the Repeat check box
    Then user double click the Calendar event Repeat Every field
    And user added 0 integer number
    Then user should be able to see less than "The value have not to be less than 1." warning message

    Examples:
      | userType      |
      | store manager |
      | sales manager |
      | driver        |

  @Ac2 @B34G13-172
  Scenario Outline: Verify that users see error messages when enter invalid integers.
    Given the user logged in as "<userType>"
    When user clicks "Calendar Events" from "Activities" tab
    And user click the Create Calendar Event button
    Then user clicks the Repeat check box
    Then user double click the Calendar event Repeat Every field
    And user added 101 integer number
    Then user should be able to see more than "The value have not to be more than 99." warning message

    Examples:
      | userType      |
      | store manager |
      | sales manager |
      | driver        |