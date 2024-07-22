package com.fleet_management.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US14_CampaignPage_ADM extends BasePage {



    @FindBy(xpath = "//a[@class='action btn mode-icon-only']")
    public WebElement filterButton;

    @FindBy(xpath = "//button[@class='ui-multiselect ui-corner-all select-filter-widget']")
    public WebElement manageFilters;

    @FindBy(xpath = "//div[@id='container']//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']//input[@type='checkbox']")
    public List<WebElement> multiSelectCheckBoxes;


}
