package com.fleet_management.step_definitions;

import com.fleet_management.pages.BasePage;
import com.fleet_management.pages.US13_VehicleCostsPage;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US13_VehicleCosts_StepDef {

    US13_VehicleCostsPage us13_vehicleCostsPage = new US13_VehicleCostsPage();

    @When("user should be able to hover the Fleet on BasePage")
    public void user_should_be_able_to_hover_the_fleet_on_base_page() {

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.waitFor(3);
        actions.moveToElement(us13_vehicleCostsPage.fleetModule).perform();
    }
    @When("user click the Vehicle Costs page")
    public void user_click_the_vehicle_costs_page() {

        us13_vehicleCostsPage.vehicleCosts.click();
    }


    @Then("user should see three following columns")
    public void userShouldSeeThreeFollowingColumns(List<String> expected) {
        BrowserUtils.waitFor(3);
        List<String> actualFollowingColumns = new ArrayList<>();


        for (WebElement eachColumns : us13_vehicleCostsPage.tableThreeColumns) {
            actualFollowingColumns.add(eachColumns.getText());

        }

        Assert.assertEquals(expected, actualFollowingColumns);
    }

    @Then("user should be abel to check the first checkbox to select All Vehicle Costs")
    public void userShouldBeAbelToCheckTheFirstCheckboxToSelectAllVehicleCosts() {

        us13_vehicleCostsPage.checkbookVehicleCosts.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(us13_vehicleCostsPage.checkbookVehicleCosts.isSelected());



    }
}
