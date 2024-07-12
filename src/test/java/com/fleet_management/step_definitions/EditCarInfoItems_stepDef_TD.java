package com.fleet_management.step_definitions;

import com.fleet_management.pages.EditCarInfoItems_Page_TD;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class EditCarInfoItems_stepDef_TD {
    EditCarInfoItems_Page_TD editCarInfoItems_page = new EditCarInfoItems_Page_TD();
    Actions actions = new Actions(Driver.getDriver());

    @When("user chooses Vehicle from  the Fleet module")
    public void user_chooses_vehicle_from_the_fleet_module() {
        editCarInfoItems_page.navigateToModule("Fleet", "Vehicles");

    }

    @When("user hover over three dots on the end of the list of records in driver page")
    public void user_hover_over_three_dots_on_the_end_of_the_list_of_records_in_driver_page() {
        //BrowserUtils.waitForVisibility(editCarInfoItems_page.driverDots,2);
       // BrowserUtils.waitForTitleContains(Driver.getDriver().getTitle());
        BrowserUtils.waitFor(2);
        actions.moveToElement(editCarInfoItems_page.driverDots).perform();
        BrowserUtils.waitFor(2);
    }

    @Then("user should see  View,Edit and Delete icons")
    public void user_should_see_view_edit_and_delete_icons() {
        for (WebElement option : editCarInfoItems_page.dotOptions) {
            BrowserUtils.waitForVisibility(option,2);
            Assert.assertTrue(option.isDisplayed());
        }
    }

    @When("user hover over three dots on the end of the list of records in sales and store page")
    public void user_hover_over_three_dots_on_the_end_of_the_list_of_records_in_sales_and_store_page() {
        //BrowserUtils.waitForVisibility(editCarInfoItems_page.salesAndStoreDots,2);
        BrowserUtils.waitFor(2);
        actions.moveToElement(editCarInfoItems_page.salesAndStoreDots).perform();
        BrowserUtils.waitFor(2);
    }


}
