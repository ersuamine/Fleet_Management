@US01 @regression
Feature: Accessing all the main modules of the app

  Background: User is already in the log in page
    Given the user is on the login page

  @AC1 @wip1
  Scenario Outline: Menu Options for sales manager
    Given the user logged in as "<userType>"
    When user should be able to see following modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Examples:
      | userType      |
      | store manager |
      | sales manager |


  @AC2 @wip1
  Scenario: Verify that ** Drivers see 4 module names.
    Given the user logged in as "driver"
    When user should be able to see following modules

      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

