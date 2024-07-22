package com.fleet_management.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US11_VehicleOdometerPage_AE extends BasePage{

    @FindBy(css = "input[type='number']")
    public WebElement pageNumber;

    @FindBy(xpath = "//div[@class='btn-group']/button[@data-toggle='dropdown']")
    public WebElement viewPerPageNumber;

}
