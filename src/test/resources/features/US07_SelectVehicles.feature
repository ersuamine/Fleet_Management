@B34G13-147
Feature: Default

	Background:User is already in the log in page

		Given the user is on the login page
		


	@B34G13-144
	Scenario Outline: Verify the checkboxes is unchecked
		    Given the user logged in as "<userType>"
		    And user clicks "Vehicles" from "Fleet" tab
		    Then user should be able to see all the checkboxes as unchecked
		
		
		    Examples:
		      | userType      |
		      | store manager |
		      | sales manager |	


	@B34G13-145
	Scenario Outline: Verify that users can check the first checkbox to select all the cars
		Given the user logged in as "<userType>"
		And user clicks "Vehicles" from "Fleet" tab
		And user should be able to see all the checkboxes as unchecked
		And user should be click the first checkbox
		Then user should be able to see all the checkboxes as selected

		 Examples:
		        | userType      |
		        | store manager |
		        | sales manager |


	@B34G13-146
	Scenario Outline: Verify that users can select any car
		Given the user logged in as "<userType>"
		And user clicks "Vehicles" from "Fleet" tab
		And user should be able to see all the checkboxes as unchecked
		Then user should be able to select a random car


		Examples:
		      | userType      |
		      | store manager |
		      | sales manager |