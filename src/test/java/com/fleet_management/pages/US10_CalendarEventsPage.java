package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US10_CalendarEventsPage extends BasePage {



    @FindBy(css = "a[title='Create Calendar event']")
    public WebElement createCalendarEventLink;

    @FindBy(tagName = "iframe")
    public WebElement iframe;


    @FindBy(id = "tinymce")
    public WebElement descriptionField;




}
