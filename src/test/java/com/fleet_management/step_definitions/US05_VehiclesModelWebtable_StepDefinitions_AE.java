package com.fleet_management.step_definitions;

import com.fleet_management.pages.US05_VehiclesModelPage_AE;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US05_VehiclesModelWebtable_StepDefinitions_AE {

    US05_VehiclesModelPage_AE vehicleModelPage = new US05_VehiclesModelPage_AE();

    @Given("user clicks Vehicle Model module from Fleet tab")
    public void user_clicks_vehicle_model_module_from_fleet_tab() {

        vehicleModelPage.navigateToModule("Fleet","Vehicles Model");
    }

    @Given("user is on the {string} page")
    public void user_is_on_the_page(String expectedPageTitle) {

        BrowserUtils.waitForTitleContains(expectedPageTitle);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedPageTitle));
    }


    @Then("user should see following columns")
    public void user_should_see_following_columns(List<String> expectedTableHeaders) {

        List<String> actualTableHeaders = new ArrayList<>();

        for (WebElement header : vehicleModelPage.tableHeaders) {
            actualTableHeaders.add(header.getText());
        }

        Assert.assertEquals(expectedTableHeaders,actualTableHeaders);
    }

    @Then("driver should see {string} error message")
    public void driver_should_see_error_message(String expectedErrorMessage) {

        BrowserUtils.waitForVisibility(vehicleModelPage.errorMessageForDriver,2);
        Assert.assertEquals(expectedErrorMessage,vehicleModelPage.errorMessageForDriver.getText());
    }
}
