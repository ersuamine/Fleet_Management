package com.fleet_management.step_definitions;

import com.fleet_management.pages.US11_VehicleOdometerPage_AE;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US11_VehiclesOdometerInfo_StepDefinitions_AE {
    US11_VehicleOdometerPage_AE odometerPage = new US11_VehicleOdometerPage_AE();

    @Then("see default page number as {int}")
    public void see_default_page_number_as(Integer expectedPageNumber) {

        Integer actualPageNumber = Integer.valueOf(odometerPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNumber,actualPageNumber);
    }

    @Then("see default View Per Page dropdown as {int}")
    public void see_default_view_per_page_dropdown_as(Integer expectedPerPageNumber) {
        Integer actualPerPageNumber = Integer.valueOf(odometerPage.viewPerPageNumber.getText());

        Assert.assertEquals(expectedPerPageNumber,actualPerPageNumber);
    }
}
