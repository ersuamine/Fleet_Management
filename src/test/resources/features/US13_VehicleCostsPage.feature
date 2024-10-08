@US13 @regression
Feature: manage filters on the Vehicle Costs page

  Background: User is already in the log in page
    Given the user is on the login page

  @AC1
  Scenario Outline: Verify that users see 3 columns on the Vehicle Costs page
    Given the user logged in as "<userType>"
    And user clicks "Vehicle Costs" from "Fleet" tab
    Then user should see three following columns
      | TYPE               |
      | TOTAL PRICE        |
      | DATE               |


    Examples:
      |userType|
      |store manager|
      |sales manager|



  @AC2
  Scenario Outline: Verify that users can check the first checkbox to select All Vehicle Costs
    Given the user logged in as "<userType>"
    And user clicks "Vehicle Costs" from "Fleet" tab
    Then user should be abel to check the first checkbox to select All Vehicle Costs
    Then user should be able to see all the checkboxes as selected
    And user click to the next page button
    Then user should be able to see all the checkboxes as selected
    And user click to the next page button
    Then user should be able to see all the checkboxes as selected
    Examples:
      |userType|
      |store manager|
      |sales manager|







