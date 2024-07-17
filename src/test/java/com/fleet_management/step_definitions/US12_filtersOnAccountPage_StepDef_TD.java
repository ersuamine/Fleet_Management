package com.fleet_management.step_definitions;

import com.fleet_management.pages.US12_filtersOnAccountPagePage_TD;
import com.fleet_management.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US12_filtersOnAccountPage_StepDef_TD {
    US12_filtersOnAccountPagePage_TD filtersOnAccountPage = new US12_filtersOnAccountPagePage_TD();

    @When("user chooses Account from  the Customer module")
    public void user_chooses_account_from_the_customer_module() {
        filtersOnAccountPage.navigateToModule("Customers", "Accounts");
    }

    @Then("user should see below filters on the Account page")
    public void user_should_see_below_filters_on_the_account_page(List<String> expectedInFilters) {
        List<String> actualInFilters = new ArrayList<>();

        for (WebElement filter : filtersOnAccountPage.allFilters) {
            String [] filterName =filter.getText().split(":");

            actualInFilters.add(filterName[0]);
        }
        Assert.assertEquals(expectedInFilters,actualInFilters);

    }

    @When("user clicks the filter button")
    public void user_clicks_the_filter_button() {
        filtersOnAccountPage.filterButton.click();
    }
}
