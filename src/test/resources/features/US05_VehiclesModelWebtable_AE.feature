@US05 @regression
Feature: Vehicles Model information webtable
  Agile story: As a user, I want to view columns on the Vehicles Model page.

  Background: User is already in the log in page
    Given the user is on the login page
@wip5
  Scenario Outline: Verify user can see columns on Vehicles Model page
    Given the user logged in as "<userType>"
    And user clicks "Vehicles Model" from "Fleet" tab
    And user is on the "Vehicles Model" page
    Then user should see following columns
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

    Examples:
      | userType      |
      | store manager |
      | sales manager |

  Scenario: Verify driver sees error message
    Given the user logged in as "driver"
    And user clicks Vehicle Model module from Fleet tab
    Then driver should see "You do not have permission to perform this action." error message