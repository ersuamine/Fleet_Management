@login @regression @US01
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @Ac1 @wip1
  Scenario Outline: Menu Options for sales manager
    Given the user logged in as "<userType>"
    Then user should be able to see following modules
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


  @Ac2 @wip1
  Scenario: Verify that ** Drivers see 4 module names.
    Given the user logged in as "driver"
    Then user should be able to see following modules

      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

