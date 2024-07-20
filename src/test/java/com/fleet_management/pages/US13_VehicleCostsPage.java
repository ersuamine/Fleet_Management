package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US13_VehicleCostsPage extends BasePage {

    public US13_VehicleCostsPage() {

        PageFactory.initElements(Driver.getDriver(), this);



    }



    @FindBy(xpath = "//table//thead[@class='grid-header']//a[@class='grid-header-cell__link']")
    public List<WebElement> tableThreeColumns;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']/input")
    public WebElement checkbookVehicleCosts;

}
