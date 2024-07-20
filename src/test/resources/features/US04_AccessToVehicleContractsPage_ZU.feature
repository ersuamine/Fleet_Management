@US04 @regression
Feature: access to Vehicle Contracts page

  Background: User is already in the log in page
    Given the user is on the login page

  @AC1
  Scenario Outline: Verify that Store managers and Sales managers can access the Vehicle Contracts page
    Given the user logged in as "<userType>"
    Then user clicks "Vehicle Contracts" from "Fleet" tab
    Then verify the url as expected as "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract"
    Then verify the expected title as "All - Vehicle Contract - Entities - System - Car - Entities - System"

    Examples:
      |userType|
      |store manager|
      |sales manager|

  @AC2
  Scenario: Verify that Drivers can NOT access the Vehicle Contracts page
    Given the user logged in as "driver"
    Then user clicks "Vehicle Contracts" from "Fleet" tab
    Then verify driver can not access the Vehicle Contracts page.
    Then verify driver should see "You do not have permission to perform this action."