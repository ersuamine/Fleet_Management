@login
Feature:  Vehicle Selection information
  Agile Story: As a user (Sales and Store manager), I should be able to select any vehicle from the
  Vehicles page (web table)

  Background: User is already in the log in page
    Given the user is on the login page

  @ACOne
  Scenario Outline: Verify the checkboxes is unchecked
    Given the user logged in as "<userType>"
    #Given the user logged in with username as "User1" and password as "UserUser123"
    #Given the user logged in as "driver"
    When user clicks on the vehicles module from fleet tab
    Then user should be able to see all the checkboxes as unchecked


    Examples:
      | userType      |
      | store manager |
      | sales manager |


@ACTwo
    Scenario Outline: Verify that users can check the first checkbox to select all the cars
      Given the user logged in as "<userType>"
      When user clicks on the vehicles module from fleet tab
      And user should be able to see all the checkboxes as unchecked
      And user should be click the first checkbox
      Then user should be able to see all the checkboxes as selected


      Examples:
        | userType      |
        | store manager |
        | sales manager |

@ACThree
  Scenario Outline: Verify that users can select any car
    Given the user logged in as "<userType>"
    When user clicks on the vehicles module from fleet tab
    And user should be able to see all the checkboxes as unchecked
    Then user should be able to select a random car


    Examples:
      | userType      |
      | store manager |
      | sales manager |
