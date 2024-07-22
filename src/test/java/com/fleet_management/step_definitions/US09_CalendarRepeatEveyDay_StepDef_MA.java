package com.fleet_management.step_definitions;

import com.fleet_management.pages.US08_CalendarEventsPage_MA;
import com.fleet_management.utilities.BrowserUtils;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class US09_CalendarRepeatEveyDay_StepDef_MA {

    US08_CalendarEventsPage_MA calendarEventsPage = new US08_CalendarEventsPage_MA();

    @Then("user double click the Calendar event Repeat Every field")
    public void userDoubleClickTheCalendarEventRepeatEveryField() {

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.waitForPageToLoad(2);
        actions.moveToElement(calendarEventsPage.repeatEveryDaysValue).doubleClick().pause(2000).perform();
    }

    @And("user added {int} integer number")
    public void userAddedIntegerNumber(int dayValue) {
        calendarEventsPage.repeatEveryDaysValue.sendKeys(String.valueOf(dayValue));
        calendarEventsPage.emptyClickSpace.click();

    }

    @Then("user should be able to see less than {string} warning message")
    public void userShouldBeAbleToSeeLessThanWarningMessage(String expectedLessThanWarningMessage) {
        Assert.assertTrue((calendarEventsPage.warningMessage.getText().contains(expectedLessThanWarningMessage)));
    }

    @Then("user should be able to see more than {string} warning message")
    public void userShouldBeAbleToSeeMoreThanWarningMessage(String expectedMoreThanWarningMessage) {
        Assert.assertTrue((calendarEventsPage.warningMessage.getText().contains(expectedMoreThanWarningMessage)));

    }


}
