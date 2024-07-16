package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US08_CreateCalendarEventPage_MA extends BasePage{

    public US08_CreateCalendarEventPage_MA() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
     public WebElement repeatCheckBox;


    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement repeatEveryDaysValue;

    @FindBy(xpath = "//span[contains(text(),'This value should not be blank.')]")
    public WebElement repeatEverydayInputBox;

}
