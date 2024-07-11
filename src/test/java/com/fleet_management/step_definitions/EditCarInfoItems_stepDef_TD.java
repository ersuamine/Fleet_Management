package com.fleet_management.step_definitions;

import com.fleet_management.pages.EditCarInfoItems_Page_TD;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EditCarInfoItems_stepDef_TD {
    EditCarInfoItems_Page_TD editCarInfoItems_page = new EditCarInfoItems_Page_TD();
    Actions actions = new Actions(Driver.getDriver());

    @When("user chooses Vehicle from  the Fleet module")
    public void user_chooses_vehicle_from_the_fleet_module() {
        editCarInfoItems_page.navigateToModule("Fleet", "Vehicles");
    }

    @When("user hover over three dots on the end of the list of records")
    public void user_hover_over_three_dots_on_the_end_of_the_list_of_records() {
        //BrowserUtils.waitForPresenceOfElement((By.xpath("(//a[.='...'])[1]")), 4);
        actions.moveToElement(editCarInfoItems_page.Dots).perform();
        BrowserUtils.sleep(5);

    }


    @Then("user should see  below options")
    public void user_should_see_below_options(String expectedDotOptions) {


    }
}
