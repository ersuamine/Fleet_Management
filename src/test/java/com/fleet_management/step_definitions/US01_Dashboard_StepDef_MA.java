package com.fleet_management.step_definitions;

import com.fleet_management.pages.US01_DashboardPage_MA;
import com.fleet_management.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;


public class US01_Dashboard_StepDef_MA {


    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {

        US01_DashboardPage_MA us01_DashboardPage = new US01_DashboardPage_MA();

        BrowserUtils.waitForTitleContains("Dashboard");

        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : us01_DashboardPage.allModules) {
            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules, actualModules);
    }
}




