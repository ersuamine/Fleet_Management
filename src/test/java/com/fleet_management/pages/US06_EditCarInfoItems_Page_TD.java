package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US06_EditCarInfoItems_Page_TD extends BasePage {

    @FindBy(xpath = "  //table//tbody/tr[1]/td[21]//div[@class='more-bar-holder']/div")
    public WebElement salesAndStoreDots;
    @FindBy(xpath = "  //table//tbody/tr[1]/td[20]//div[@class='more-bar-holder']/div")
    public WebElement driverDots;
    @FindBy(xpath = "(//ul[@class='nav nav-pills icons-holder launchers-list'])[1]//a")
    public List<WebElement> iconList;
    @FindBy(xpath = "(//ul[@class='nav nav-pills icons-holder launchers-list'])[1]")
    public WebElement iconBar;

}
