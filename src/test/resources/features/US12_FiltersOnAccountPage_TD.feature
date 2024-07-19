@B34G13-131 @US12 @regression
Feature: filters onAccount page
  User Story: As a user, I want to filter customers’ info on the Accounts page.


  Background:User is already in the log in page
    #@B34G13-138
    Given the user is on the login page
  @B34G13-131
  Scenario Outline: Verify user see 8 modules in account page
    Given the user logged in as "<userType>"
    And user clicks "Accounts" from "Customers" tab
    And user clicks the filter button
    Then user should see below filters on the Account page
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |
    Examples:
      | userType      |
      | store manager |
      | sales manager |