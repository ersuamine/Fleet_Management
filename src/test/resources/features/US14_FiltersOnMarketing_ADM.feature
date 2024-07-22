
@US14 @regression @B34G13-176
Feature: filters on the Marketing page

  Background: User is already in the log in page
    #@B34G13-138
    Given the user is on the login page


  @AC1 @B34G13-174
  Scenario Outline: manage filters on the Marketing page
    Given the user logged in as "<userType>"
    When user clicks "Campaigns" from "Marketing" tab
    Then user click the filter button
    Then user should be able to click the Manage filters
    Then Verify all five modules are checked by default

    Examples:
      |userType|
      |store manager|
      |sales manager|

  @AC2 @B34G13-175
  Scenario Outline: Verify that any amount of boxes can be unchecked. (Can check only 1 or multiple)
    Given the user logged in as "<userType>"
    When user clicks "Campaigns" from "Marketing" tab
    Then user click the filter button
    Then user should be able to click the Manage filters
    And user should be able to click any amount of checkboxes to uncheck

    Examples:
      |userType|
      |store manager|
      |sales manager|










