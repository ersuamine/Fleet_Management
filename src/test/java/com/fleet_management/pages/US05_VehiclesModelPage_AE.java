package com.fleet_management.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US05_VehiclesModelPage_AE extends BasePage {

    @FindBy(xpath = "//table//thead[@class='grid-header']//a[@class='grid-header-cell__link']")
    public List<WebElement> tableHeaders;

    @FindBy(xpath = "//div[@data-messenger-namespace='eed2dfc230ad3968235b216c8d8c54588cb2f30904a1c179d4416e09dd8008d3']/div")
    public WebElement errorMessageForDriver;

}
