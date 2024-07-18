package com.fleet_management.step_definitions;

import com.fleet_management.pages.US06_EditCarInfoItems_Page_TD;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US06_EditCarInfoItems_stepDef_TD {
    US06_EditCarInfoItems_Page_TD editCarInfoItems_page = new US06_EditCarInfoItems_Page_TD();
    Actions actions = new Actions(Driver.getDriver());

    @When("user chooses {string} from  the {string} module")
    public void user_chooses_from_the_module(String page, String module) {
        editCarInfoItems_page.navigateToModule(module, page);
    }


    @When("user hover over three dots on the end of the list of records in driver page")
    public void user_hover_over_three_dots_on_the_end_of_the_list_of_records_in_driver_page() {

        actions.moveToElement(editCarInfoItems_page.driverDots).pause(2000).click(editCarInfoItems_page.driverDots).build().perform();

    }

    @Then("user should see below icons")
    public void user_should_see_below_icons(List<String> expectedIcons) {

        actions.moveToElement(editCarInfoItems_page.iconBar);
        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = new ArrayList<>();
        for (WebElement icons : editCarInfoItems_page.iconList) {
            actualOptions.add(icons.getAttribute("title"));
        }

        Assert.assertTrue(expectedIcons.containsAll(actualOptions));

    }


    @When("user hover over three dots on the end of the list of records in sales and store page")
    public void user_hover_over_three_dots_on_the_end_of_the_list_of_records_in_sales_and_store_page() {


        actions.moveToElement(editCarInfoItems_page.salesAndStoreDots).pause(2000).click(editCarInfoItems_page.salesAndStoreDots).build().perform();

    }
}



