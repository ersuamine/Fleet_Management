package com.fleet_management.step_definitions;

import com.fleet_management.pages.US10_CalendarEventsPage;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US10_CalendarEvents_StepDef {


    US10_CalendarEventsPage us10_CalendarEventsPage = new US10_CalendarEventsPage();





    @And("user should be able to type messages in to the Description field")
    public void userShouldBeAbleToTypeMessagesInToTheDescriptionField() {

        BrowserUtils.waitFor(3);
        Driver.getDriver().switchTo().frame(us10_CalendarEventsPage.iframe);

        us10_CalendarEventsPage.descriptionField.sendKeys("Scrum daily meeting");


    }

    @Then("user should be able to see what's typed in the Description field")
    public void userShouldBeAbleToSeeWhatSTypedInTheDescriptionField() {

        String actualText = us10_CalendarEventsPage.descriptionField.getText();

        String expectedText = "Scrum daily meeting";

        Assert.assertEquals(expectedText, actualText);

    }
}
