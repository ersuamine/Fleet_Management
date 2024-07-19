package com.fleet_management.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US01_DashboardPage_MA extends BasePage{

    public US01_DashboardPage_MA(){

    }
    @FindBy(css="li.dropdown.dropdown-level-1")
    public List<WebElement> allModules;

}
