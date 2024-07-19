@B34G13-140
Feature: Accessing the Oroinc Documentation feature
  Agile story: As a user, I should access to the Oroinc Documentation page

  Background: User is already in the log in page
		#@B34G13-138
    Given the user is on the login page


  @B34G13-139
  Scenario Outline: Verify that users access to the Oroinc Documentation page by clicking the question mark icon
  The page’s URL is: https://doc.oroinc.com/
    Given the user logged in as "<userType>"
    When users click the the question mark icon
    Then users access to the Oroinc Documentation page

    Examples:
      | userType      |
      | store manager |
      | sales manager |
      | driver        |

