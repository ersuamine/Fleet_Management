@B34G13-158 @US06
Feature: Edit car info items
  User Story:As a user, I want to see edit car info icons from the Vehicle page.

  Background:User is already in the log in page
		#@B34G13-138
    Given the user is on the login page

  @B34G13-159
  Scenario: verify user see "delete","view" and "edit" options when hovering over ellipses on vehicles page
    Given the user logged in as "driver"
    And user clicks "Vehicles" from "Fleet" tab
    And user hover over ellipses on the end of the list of records in driver page
    Then user should see below icons
      | Delete |
      | View   |
      | Edit   |

  @B34G13-128
  Scenario Outline: verify user see "delete","view" and "edit" options when hovering over ellipses on vehicles page
    Given the user logged in as "<userType>"
    And user clicks "Vehicles" from "Fleet" tab
    And user hover over ellipses on the end of the list of records in sales and store page
    Then user should see below icons
      | Delete |
      | View   |
      | Edit   |
    Examples:
      | userType      |
      | store manager |
      | sales manager |