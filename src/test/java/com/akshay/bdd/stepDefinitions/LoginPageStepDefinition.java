package com.akshay.bdd.stepDefinitions;

import com.akshay.bdd.pages.LoginPage;
import com.akshay.bdd.utils.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;

import java.io.IOException;
import java.time.LocalDateTime;

public class LoginPageStepDefinition extends StepDefinition {

    @Before
    public void beforeEachScenario(Scenario scenario) {
        this.scenario = scenario;
        System.out.println("Execution started for Scenario : " + scenario.getName() + ". Start Time : " + dtf.format(LocalDateTime.now()) + "\n");
        logger.info("Execution started for Scenario : " + scenario.getName() + ". Start Time : " + dtf.format(LocalDateTime.now()) + "\n");
    }

    @After
    public void afterEachScenario() {
        System.out.println("Execution completed for Scenario : " + scenario.getName() + ". End Time : " + dtf.format(LocalDateTime.now()) + "\n");
        logger.info("Execution completed for Scenario : " + scenario.getName() + ". End Time : " + dtf.format(LocalDateTime.now()) + "\n");
    }

    public LoginPageStepDefinition() {
        loginPage = new LoginPage(driver);
    }

    @Given("^User launches application$")
    public void user_launches_application() throws IOException {
        try {
            StepDefinition.driver.get(configManager.getProperty("url"));
        } catch (NoSuchSessionException e) {
            StepDefinition.driver = null;
            WebDriverManager driverManager = new WebDriverManager();
            StepDefinition.driver = driverManager.getDriver();
            loginPage = new LoginPage(driver);
            StepDefinition.driver.get(configManager.getProperty("url"));
        }
    }

    @When("^User enters default username and default password$")
    public void user_enters_default_username_and_default_password() throws IOException {
        loginPage.setEmail(configManager.getProperty("username"));
        loginPage.setElePassword(configManager.getProperty("password"));
    }

    @When("^User clicks Login Button$")
    public void user_clicks_login_button() {
        loginPage.clickLogin();
    }

    @Then("^User should login into application$")
    public void user_should_login_into_application() {
        try {
            driver.findElement(By.xpath("//a[text()='Logout']"));
            Assert.assertTrue(true);
        } catch (NoSuchElementException e) {
            if (driver.getPageSource().contains("Login was unsuccessful")) {
                user_closes_application();
                Assert.fail("Login Unsuccessful. Check credentials");
            } else {
                e.printStackTrace();
                user_closes_application();
                Assert.fail("Login Unsuccessful\n" + e.getMessage());
            }
        }
    }

    @Then("^User closes application$")
    public void user_closes_application() {
        driver.quit();
    }

}
