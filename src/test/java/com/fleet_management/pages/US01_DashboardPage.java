package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US01_DashboardPage {

    public US01_DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(css="li.dropdown.dropdown-level-1")
    public List<WebElement> allModules;


}
