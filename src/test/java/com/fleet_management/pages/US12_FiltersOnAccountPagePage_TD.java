package com.fleet_management.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US12_FiltersOnAccountPagePage_TD extends BasePage {

    @FindBy(xpath = "//div[@class='filter-item oro-drop']/div[1]")
    public List<WebElement> allFilters;

    @FindBy(xpath = "//a[@class='action btn mode-icon-only']")
    public WebElement filterButton;

    @FindBy(xpath = "//div[@class='filter-box oro-clearfix-width']")
    public WebElement filterBox;
}
