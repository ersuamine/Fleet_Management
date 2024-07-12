Feature: Edit car info items
  User Story:As a user, I want to see edit car info icons from the Vehicle page.

  Scenario Outline: verify user see "delete","view" and "edit" options when hovering over "..." on vehicles page
    Given the user logged in as "<userType>"
    When user chooses Vehicle from  the Fleet module
    And user hover over three dots on the end of the list of records in driver page
    Then user should see  View,Edit and Delete icons
    Examples:
      | userType |
      | driver   |
  Scenario Outline: verify user see "delete","view" and "edit" options when hovering over "..." on vehicles page
    Given the user logged in as "<userType>"
    When user chooses Vehicle from  the Fleet module
    And user hover over three dots on the end of the list of records in sales and store page
    Then user should see  View,Edit and Delete icons
    Examples:
      | userType      |
      | store manager |
      | sales manager |