package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US08_CalendarEventsPage_MA extends BasePage{


    @FindBy(xpath = "//a[@title='Create Calendar event'][1]")
    public WebElement createCalendarEventButton;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement repeatEveryDaysValue;

    @FindBy(xpath = "//span[contains(text(),'This value should not be blank.')]")
    public WebElement repeatEverydayInputBox;

}
