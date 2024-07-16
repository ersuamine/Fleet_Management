package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US07_SelectVehiclesPage extends BasePage  {

    public US07_SelectVehiclesPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class =\"title title-level-1\"])[2]")
    public List<WebElement> FleetModule;

    @FindBy (xpath = "//span[.=\"Vehicles\"]")
    public WebElement vehicles;

    @FindBy (xpath = "//input[@tabindex='-1']")
    public List <WebElement> checkboxes;

    @FindBy(xpath = "(//input[@type='checkbox'])[20]")
    public WebElement checkbox;

}
