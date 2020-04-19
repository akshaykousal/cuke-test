package com.akshay.bdd.stepDefinitions;

import com.akshay.bdd.pages.DashboardPage;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class DashboardPageStepDefinition extends StepDefinition {

    public DashboardPageStepDefinition() {
        dashboardPage = new DashboardPage(driver);
    }

    @Given("^User is on Dashboard page$")
    public void user_is_on_Dashboard_page() {
        String pageHeader = dashboardPage.getPageHeader();
        if (pageHeader.trim().contains("Dashboard")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Expected: Page header should be 'Dashboard'. Actual : " + pageHeader);
        }
    }

}
