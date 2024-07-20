package com.fleet_management.step_definitions;

import com.fleet_management.pages.US04_VehicleContractsPage_ZU;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US04_VehicleContracts_StepDef_ZU {

    US04_VehicleContractsPage_ZU vehicleContractsPageZu = new US04_VehicleContractsPage_ZU();
    @Then("verify the url as expected as {string}")
    public void verify_the_url_as_expected_as(String expectedUrl) {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("verify the expected title as {string}")
    public void verify_the_expected_title_as(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();
        BrowserUtils.waitForTitleContains(expectedTitle);
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Then("verify driver can not access the Vehicle Contracts page.")
    public void verifyDriverCanNotAccessTheVehicleContractsPage() {

        Assert.assertTrue(vehicleContractsPageZu.permissionMessage.isDisplayed());
    }

    @Then("verify driver should see {string}")
    public void verifyDriverShouldSee(String expectedPermissionMessage) {

        String actualPermissionMessage = vehicleContractsPageZu.permissionMessage.getText();
        Assert.assertEquals(actualPermissionMessage, expectedPermissionMessage);

    }
}
