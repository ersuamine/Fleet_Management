package com.fleet_management.step_definitions;

import com.fleet_management.pages.US02_OroincDocumentationPage_page_ZC;
import com.fleet_management.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

public class US02_OroincDocumentationPage_StepDef_ZC {

    US02_OroincDocumentationPage_page_ZC oroincDocumentationPagePageZc = new US02_OroincDocumentationPage_page_ZC();

    @When("users click the the question mark icon")
    public void users_click_the_the_question_mark_icon() {

        oroincDocumentationPagePageZc.questionMark.click();

    }



    @Then("users access to the Oroinc Documentation page")
    public void users_access_to_the_oroinc_documentation_page() {

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {

            Driver.getDriver().switchTo().window(each);

            if (Driver.getDriver().getCurrentUrl().contains("doc.oroinc")){
                break;
            }
        }


    }


}
