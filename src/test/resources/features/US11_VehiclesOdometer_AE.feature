@B34G13-157
Feature: Vehicles Odometer page information
  Agile story: As a user, I want to view car odometer info on the Vehicles Odometer page.

  Background:User is already in the log in page
    Given the user is on the login page

  @B34G13-154
  Scenario: Verify drivers see the default page as 1.
    Given the user logged in as "driver"
    And user clicks "Vehicle Odometer" from "Fleet" tab
    Then see default page number as 1

  @B34G13-155
  Scenario: Verify drivers see the View Per Page as 25 by default.
    Given the user logged in as "driver"
    And user clicks "Vehicle Odometer" from "Fleet" tab
    Then see default View Per Page dropdown as 25

  @B34G13-156
  Scenario Outline: Verify store and sales manager and sees error message upon clicking Vehicle Odometer page
    Given the user logged in as "<userType>"
    And user clicks "Vehicle Odometer" from "Fleet" tab
    Then user should see "You do not have permission to perform this action." error message

    Examples:
      | userType      |
      | store manager |
      | sales manager |