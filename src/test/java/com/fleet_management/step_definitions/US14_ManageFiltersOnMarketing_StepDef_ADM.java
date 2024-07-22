package com.fleet_management.step_definitions;

import com.fleet_management.pages.US14_CampaignPage_ADM;
import com.fleet_management.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Random;


public class US14_ManageFiltersOnMarketing_StepDef_ADM {

    US14_CampaignPage_ADM us14_campaignPage = new US14_CampaignPage_ADM();


    @Then("user click the filter button")
    public void userClickTheFilterButton() {
        us14_campaignPage.filterButton.click();

    }

    @Then("user should be able to click the Manage filters")
    public void user_should_be_able_to_click_the_manage_filters() {
        us14_campaignPage.manageFilters.click();

    }

    @Then("Verify all five modules are checked by default")
    public void verify_all_five_modules_are_checked_by_default() {
        BrowserUtils.waitForPageToLoad(2);

        if (!us14_campaignPage.multiSelectCheckBoxes.isEmpty()) {

            for (WebElement clickedCheckBox : us14_campaignPage.multiSelectCheckBoxes) {
                Assert.assertTrue(clickedCheckBox.isSelected());


            }
        } else {
            Assert.fail("The list is empty, there are no checkboxes");
        }

    }

    @And("user should be able to click any amount of checkboxes to uncheck")
    public void userShouldBeAbleToClickAnyAmountOfCheckboxesToUncheck() {

        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 4
        int randomIndex = rand.nextInt(5);

        //unchecking the checkbox
        us14_campaignPage.multiSelectCheckBoxes.get(randomIndex).click();

        Assert.assertFalse(us14_campaignPage.multiSelectCheckBoxes.get(randomIndex).isSelected());


    }
}






