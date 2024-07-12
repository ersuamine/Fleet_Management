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
/////tbody/tr[1]/td[21]//a[@class='dropdown-toggle']
    @FindBy(xpath = "  //table//tbody/tr[1]/td[21]//div[@class='dropdown']")
    public WebElement salesAndStoreDots;
    @FindBy(xpath = "  //table//tbody/tr[1]/td[20]//div[@class='dropdown']")
    public WebElement driverDots;
    //(//a[@title='Delete'])[1]
    @FindBy(xpath = "//tbody/tr[1]/td[20]//div[@class='dropdown']//li[@class='launcher-item']")
    public List<WebElement> dotOptions;
}
