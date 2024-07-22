@B34G13-153 @US05 @regression
Feature: Vehicles Model information webtable
  Agile story: As a user, I want to view columns on the Vehicles Model page.

  #@B34G13-138
  Background:User is already in the log in page
    Given the user is on the login page

  @B34G13-151
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

  @B34G13-152
  Scenario: Verify driver sees error message upon clicking Vehicles Model module
    Given the user logged in as "driver"
    And user clicks "Vehicles Model" from "Fleet" tab
    Then user should see "You do not have permission to perform this action." error message