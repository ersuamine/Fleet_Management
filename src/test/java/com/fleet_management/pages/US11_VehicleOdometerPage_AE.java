package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_VehicleOdometerPage_AE {

    public US11_VehicleOdometerPage_AE(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li/input[@type='number']")
    public WebElement pageNumber;

    @FindBy(xpath = "//div[@class='btn-group']/button[@data-toggle='dropdown']")
    public WebElement viewPerPageNumber;



}
