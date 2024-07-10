package com.fleet_management.step_definitions;

import com.fleet_management.pages.PinbarHelp_page_ZC;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Pinbar_stepDef_ZC {

    PinbarHelp_page_ZC pinbarHelpPageZc = new PinbarHelp_page_ZC();
    LoginStepDefs loginStepDefs = new LoginStepDefs();

    @When("{string} click the “Learn how to use this space” link on the homepage")
    public void clickTheLearnHowToUseThisSpaceLinkOnTheHomepage(String userType) {

        loginStepDefs.the_user_logged_in_as(userType);
        pinbarHelpPageZc.howToUseThisSpace.click();

    }



    @Then("users see “How To Use Pinbar”")
    public void seeHowToUsePinbar() {

        String actualPinbarText = pinbarHelpPageZc.howToUsePinbar.getText();

        Assert.assertEquals("How To Use Pinbar", actualPinbarText);
    }



    @And("users see “Use pin icon on the right top corner of page to create fast access link in the pinbar.”")
    public void seeUseThePinIconOnTheRightTopCornerOfPageToCreateFastAccessLinkInThePinbar() {

        String actualText = pinbarHelpPageZc.usePinIconText.getText();
        String expectedText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

        Assert.assertTrue(actualText.contains(expectedText));
    }
}
