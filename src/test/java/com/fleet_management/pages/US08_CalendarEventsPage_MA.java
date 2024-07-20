package com.fleet_management.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US08_CalendarEventsPage_MA extends BasePage {


    @FindBy(xpath = "//a[@title='Create Calendar event'][1]")
    public WebElement createCalendarEventButton;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement repeatEveryDaysValue;

    @FindBy(xpath = "(//div[@class='recurrence-subview-control__item'])[1]/label/input[3]/../../span")
    public WebElement warningMessage;

}