@US10 @regression
Feature: I want to type into the Description field when I create a calendar event

  Background: User is already in the log in page
    Given the user is on the login page

  @AC1
  Scenario Outline: Verify that users can type messages in to the Description field on the Calendar Events page
    Given the user logged in as "<userType>"
    And user clicks "Calendar Events" from "Activities" tab
    Then user click to the Create Calendar event button
    And user should be able to type messages in to the Description field
    Then user should be able to see what's typed in the Description field

    Examples:
    Examples:
      | userType      |
      | store manager |
      | sales manager |
      | driver        |






