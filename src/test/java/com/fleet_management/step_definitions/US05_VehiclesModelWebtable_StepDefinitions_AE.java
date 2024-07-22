package com.fleet_management.step_definitions;

import com.fleet_management.pages.US05_VehiclesModelPage_AE;
import com.fleet_management.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;

public class US05_VehiclesModelWebtable_StepDefinitions_AE {

    US05_VehiclesModelPage_AE vehicleModelPage = new US05_VehiclesModelPage_AE();
    
    @Given("user clicks {string} from {string} tab")
    public void user_clicks_from_tab(String moduleName, String tabName) {

        vehicleModelPage.navigateToModule(tabName,moduleName);
    }

    @Given("user is on the {string} page")
    public void user_is_on_the_page(String expectedPageTitle) {

        BrowserUtils.waitForTitleContains(expectedPageTitle);
        BrowserUtils.verifyTitleContains(expectedPageTitle);
    }

    @Then("user should see following columns")
    public void user_should_see_following_columns(List<String> expectedTableHeaders) {

        List<String> actualTableHeaders = BrowserUtils.getElementsText(vehicleModelPage.tableHeaders);
        Assert.assertEquals(expectedTableHeaders,actualTableHeaders);
    }

    @Then("user should see {string} error message")
    public void user_should_see_error_message(String expectedErrorMessage) {

        BrowserUtils.waitForVisibility(vehicleModelPage.errorMessageForDriver,2);
        Assert.assertEquals(expectedErrorMessage,vehicleModelPage.errorMessageForDriver.getText());
    }
}
