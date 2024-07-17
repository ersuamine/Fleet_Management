package com.fleet_management.pages;

import com.fleet_management.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US02_OroincDocumentationPage_page_ZC extends BasePage{

    public US02_OroincDocumentationPage_page_ZC(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "i.fa-question-circle")
    public WebElement questionMark;


}
