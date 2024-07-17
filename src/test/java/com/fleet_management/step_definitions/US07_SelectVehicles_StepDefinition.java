package com.fleet_management.step_definitions;

import com.fleet_management.pages.US07_SelectVehiclesPage;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US07_SelectVehicles_StepDefinition {


    US07_SelectVehiclesPage us07SelectVehiclesPage = new US07_SelectVehiclesPage();


    @When("user clicks on the vehicles module from fleet tab")
    public void userClicksOnTheVehiclesModuleFromFleetTab() {

      us07SelectVehiclesPage.navigateToModule("Fleet","Vehicles");
    }


    @Then("user should be able to see all the checkboxes as unchecked")
    public void userShouldBeAbleToSeeAllTheCheckboxesAs() {

        List<WebElement> actualBoxes = us07SelectVehiclesPage.checkboxes;

        for(WebElement each : actualBoxes){
            Assert.assertFalse(each.isSelected());
            //Assert.assertTrue(!(each.isSelected()));
        }

        // actualBox.get(0)
    }
    @And("user should be click the first checkbox")
    public void userShouldBeClickTheFirstCheckbox() {
        us07SelectVehiclesPage.checkbox.click();
    }

    @Then("user should be able to see all the checkboxes as selected")
    public void userShouldBeAbleToSeeAllTheCheckboxesAsSelected() {

        List<WebElement> actualBoxes = us07SelectVehiclesPage.checkboxes;

        for(WebElement each : actualBoxes) {
            Assert.assertTrue(each.isSelected());
        }

    }

    @Then("user should be able to select a random car")
    public void userShouldBeAbleToSelectARandomCar() {

        List<WebElement> actualBoxes = us07SelectVehiclesPage.checkboxes;
        BrowserUtils.waitFor(2);
        actualBoxes.get(7).click();

    }
}
