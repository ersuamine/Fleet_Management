package com.fleet_management.step_definitions;

import com.fleet_management.pages.US08_CalendarEventsPage_MA;
import com.fleet_management.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_CreateCalendarEvent_StepDef_MA {

    US08_CalendarEventsPage_MA calendarEventsPage = new US08_CalendarEventsPage_MA();


    @When("user click the Create Calendar Event button")
    public void user_click_the_create_calendar_event_button() {

        calendarEventsPage.createCalendarEventButton.click();

    }
    @Then("user clicks the Repeat check box")
    public void user_clicks_the_repeat_check_box() {
        BrowserUtils.waitFor(2);
        calendarEventsPage.repeatCheckBox.click();
    }

    @Then("user verifies the number {string} by default in the Repeat Every input option.")

    public void user_verifies_the_number_by_default_in_the_repeat_every_input_option(String expectedDayValue) {

        String actualDayValue = calendarEventsPage.repeatEveryDaysValue.getAttribute("value");

        Assert.assertEquals(expectedDayValue, actualDayValue);

    }

    @Then("user cleared the Calendar event Repeat Every field")
    public void userClearedTheCalendarEventRepeatEveryField() {
        calendarEventsPage.repeatEveryDaysValue.clear();
    }

    @Then("user should be able to see {string} error message")

    public void userShouldBeAbleToSeeErrorMessage(String expectedWarningMessage) {
        Assert.assertTrue(expectedWarningMessage.contains(calendarEventsPage.warningMessage.getText()));


    }
}
