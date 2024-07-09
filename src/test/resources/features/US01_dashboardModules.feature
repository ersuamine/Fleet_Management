@login @regression
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @salesManager
  Scenario: Menu Options for sales manager
    When "sales manager" enters the information
    Then sales manager should be able to see following modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  @storeManager
  Scenario: Menu Options for storemanager
    When "store manager" enters the information
    Then store manager should be able to see following modules

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

 # Expected module names:
 # Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System

@driver
  Scenario: Verify that ** Drivers see 4 module names.
    When "driver" enters the information
    Then driver should be able to see following modules

      | Fleet      |
      | Customers  |
      | Activities |
      | System     |
 #Expected module names:
 # Fleet, Customers, Activities, System
