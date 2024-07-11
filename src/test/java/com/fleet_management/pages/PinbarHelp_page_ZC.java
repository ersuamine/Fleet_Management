package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarHelp_page_ZC extends BasePage{

    public PinbarHelp_page_ZC(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div/a[@href='/pinbar/help']")
    public WebElement howToUseThisSpace;


    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement howToUsePinbar;


    @FindBy(xpath = "//div[@class='clearfix']/p[1]")
    public WebElement usePinIconText;


    @FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement image;
}
