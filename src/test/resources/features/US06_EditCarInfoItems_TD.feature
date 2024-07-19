@US06 @regression
Feature: Edit car info items
  User Story:As a user, I want to see edit car info icons from the Vehicle page.
  Background:User is already in the log in page
    Given the user is on the login page
  Scenario: verify user see "delete","view" and "edit" options when hovering over "..." on vehicles page
    Given the user logged in as "driver"
    When user chooses "Vehicles" from  the "Fleet" module
    And user hover over ellipses on the end of the list of records in driver page
    Then user should see below icons
      | Delete |
      | View   |
      | Edit   |

  Scenario Outline: verify user see "delete","view" and "edit" options when hovering over "..." on vehicles page
    Given the user logged in as "<userType>"
    When user chooses "Vehicles" from  the "Fleet" module
    And user hover over ellipses on the end of the list of records in sales and store page
    Then user should see below icons
      | Delete |
      | View   |
      | Edit   |
    Examples:
      | userType      |
      | store manager |
      | sales manager |