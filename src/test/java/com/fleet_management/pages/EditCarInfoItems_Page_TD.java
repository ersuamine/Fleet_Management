package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EditCarInfoItems_Page_TD extends BasePage {
    public EditCarInfoItems_Page_TD() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Vehicles']")
    public WebElement Vehicles;

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement FleetModule;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement Dots;
    //(//a[@title='Delete'])[1]
    @FindBy(xpath = "(//ul[@class='nav nav-pills icons-holder launchers-list']//a)")
    public List<WebElement> dotOptions;
}
