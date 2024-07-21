package com.fleet_management.step_definitions;

import com.fleet_management.pages.US10_CalendarEventsPage;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US10_CalendarEvents_StepDef {


    US10_CalendarEventsPage us10_CalendarEventsPage = new US10_CalendarEventsPage();



    @Then("user click to the Create Calendar event button")
    public void user_click_to_the_create_calendar_event_button() {
        BrowserUtils.waitFor(3);
        us10_CalendarEventsPage.createCalendarEventLink.click();

    }


    @And("user should be abel to type messages in to the Description field")
    public void userShouldBeAbelToTypeMessagesInToTheDescriptionField() {

        BrowserUtils.waitFor(3);
        Driver.getDriver().switchTo().frame(us10_CalendarEventsPage.iframe);

        us10_CalendarEventsPage.descriptionField.sendKeys("Scrum daily meeting");


    }

    @Then("user should be abel to see what's typed in the Description field")
    public void userShouldBeAbelToSeeWhatSTypedInTheDescriptionField() {

        String actualText = us10_CalendarEventsPage.descriptionField.getText();

        String expectedText = "Scrum daily meeting";

        Assert.assertEquals(expectedText, actualText);

    }
}
