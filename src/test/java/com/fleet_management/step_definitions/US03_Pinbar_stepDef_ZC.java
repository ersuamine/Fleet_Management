package com.fleet_management.step_definitions;

import com.fleet_management.pages.US03_PinbarHelp_page_ZC;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US03_Pinbar_stepDef_ZC {

    US03_PinbarHelp_page_ZC pinbarHelpPageZc = new US03_PinbarHelp_page_ZC();

    @When("users click the “Learn how to use this space” link on the homepage")
    public void users_click_the_learn_how_to_use_this_space_link_on_the_homepage() {

        pinbarHelpPageZc.howToUseThisSpace.click();

    }



    @Then("users see “How To Use Pinbar”")
    public void users_see_how_to_use_pinbar() {

        String actualPinbarText = pinbarHelpPageZc.howToUsePinbar.getText();

        Assert.assertEquals("How To Use Pinbar", actualPinbarText);

    }



    @Then("users see “Use pin icon on the right top corner of page to create fast access link in the pinbar.”")
    public void users_see_use_pin_icon_on_the_right_top_corner_of_page_to_create_fast_access_link_in_the_pinbar() {

        String actualText = pinbarHelpPageZc.usePinIconText.getText();
        String expectedText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

        Assert.assertTrue(actualText.contains(expectedText));

    }



    @Then("users see an image on the page.")
    public void usersSeeAnImageOnThePage() {

        Assert.assertTrue(pinbarHelpPageZc.image.isDisplayed());

    }
}
