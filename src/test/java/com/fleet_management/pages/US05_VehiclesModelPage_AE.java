package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US05_VehiclesModelPage_AE extends BasePage {

    public US05_VehiclesModelPage_AE(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//table//thead[@class='grid-header']//a[@class='grid-header-cell__link']")
    public List<WebElement> tableHeaders;

    @FindBy(xpath = "//div[text()='You do not have permission to perform this action.']")
    public WebElement errorMessageForDriver;



}
