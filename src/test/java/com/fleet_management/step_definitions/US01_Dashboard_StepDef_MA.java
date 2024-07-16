package com.fleet_management.step_definitions;

import com.fleet_management.pages.US01_DashboardPage_MA;
import com.fleet_management.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class US01_Dashboard_StepDef_MA {

    US01_DashboardPage_MA us01_DashboardPage = new US01_DashboardPage_MA();
    LoginStepDefs loginStepDefs = new LoginStepDefs();



    @When("{string} enters the information")
    public void enters_the_information(String userType) {

        loginStepDefs.the_user_logged_in_as(userType);


    }

    @Then("sales manager should be able to see following modules")
    public void sales_manager_should_be_able_to_see_following_modules(List<String> expectedModules) {

        BrowserUtils.waitForTitleContains("Dashboard");
        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : us01_DashboardPage.allModules) {
            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules, actualModules);

    }


    @Then("store manager should be able to see following modules")
    public void storeManagerShouldBeAbleToSeeFollowingModules(List<String> expectedModules) {

        BrowserUtils.waitForTitleContains("Dashboard");
        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : us01_DashboardPage.allModules) {
            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules, actualModules);

    }

    @Then("driver should be able to see following modules")
    public void driverShouldBeAbleToSeeFollowingModules(List<String> expectedModules) {

        BrowserUtils.waitForTitleContains("Dashboard");
        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : us01_DashboardPage.allModules) {
            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules, actualModules);

    }

}




