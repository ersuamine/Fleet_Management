package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US04_VehicleContractsPage_ZU extends BasePage {


        @FindBy(xpath = "//span[.='Vehicle Contracts']")
        public WebElement vehicleContracts;

        @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
        public WebElement permissionMessage;
    }



