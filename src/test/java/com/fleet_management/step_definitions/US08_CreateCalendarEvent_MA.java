package com.fleet_management.step_definitions;

import com.fleet_management.pages.US08_CalendarEventsPage_MA;
import com.fleet_management.pages.US08_CreateCalendarEventPage_MA;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US08_CreateCalendarEvent_MA {
    US08_CalendarEventsPage_MA us08_CalendarEventsPage = new US08_CalendarEventsPage_MA();
    US08_CreateCalendarEventPage_MA us08_CreateCalendarEventPage = new US08_CreateCalendarEventPage_MA();


    @When("user should be able to hover the activities on BasePage")
    public void user_should_be_able_to_hover_the_activities_on_base_page() {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.waitFor(2);
        actions.moveToElement(us08_CalendarEventsPage.calendarEvents).perform();

    }

    @When("user clicks the Calender Event")
    public void user_clicks_the_calender_event() {

        us08_CalendarEventsPage.calendarEvents.click();

    }

    @Then("user click the Create Calendar Event")
    public void user_click_the_create_calendar_event() {
        us08_CalendarEventsPage.createCalendarEventButton.click();
    }

    @Then("user clicks the Repeat check box")
    public void user_clicks_the_repeat_check_box() {
        BrowserUtils.waitFor(2);
        us08_CreateCalendarEventPage.repeatCheckBox.click();
    }

    @Then("user verifies the number {string} by default in the Repeat Every input option.")
    public void userVerifiesTheNumberByDefaultInTheRepeatEveryInputOption(String expectedDayValue) {


        String actualDayValue = us08_CreateCalendarEventPage.repeatEveryDaysValue.getAttribute("value");

        Assert.assertTrue(expectedDayValue.equals(actualDayValue));
    }

    @Then("user cleared the Calendar event Repeat Every field")
    public void userClearedTheCalendarEventRepeatEveryField() {
        us08_CreateCalendarEventPage.repeatEveryDaysValue.clear();
    }

    @Then("user should be able to see {string} error message")
    public void userShouldBeAbleToSeeErrorMessage(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage, us08_CreateCalendarEventPage.repeatEverydayInputBox.getText());

    }
}
