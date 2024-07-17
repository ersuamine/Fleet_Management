package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US12_filtersOnAccountPagePage_TD extends BasePage {
    public US12_filtersOnAccountPagePage_TD(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='filter-item oro-drop']/div[1]")
    public List<WebElement> allFilters;
    //a[@class='action btn mode-icon-only']
    @FindBy(xpath = "//a[@class='action btn mode-icon-only']")
    public WebElement filterButton;
}
