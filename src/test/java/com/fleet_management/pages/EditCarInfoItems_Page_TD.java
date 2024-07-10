package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class EditCarInfoItems_Page_TD extends BasePage {
    public EditCarInfoItems_Page_TD() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
