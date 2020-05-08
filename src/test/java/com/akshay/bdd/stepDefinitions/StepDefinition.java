package com.akshay.bdd.stepDefinitions;

import com.akshay.bdd.pages.DashboardPage;
import com.akshay.bdd.pages.LoginPage;
import com.akshay.bdd.utils.ConfigManager;
import com.akshay.bdd.utils.WebDriverManager;
import cucumber.api.Scenario;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class StepDefinition {

    static WebDriver driver;
    Scenario scenario;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    ConfigManager configManager = new ConfigManager();

    StepDefinition() {
        WebDriverManager driverManager = new WebDriverManager();
        try {
            if (StepDefinition.driver == null) {
                StepDefinition.driver = driverManager.getDriver();
            }
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail("Fail to load webdriver");
        }
    }

    static Logger logger;

    static {
        logger = Logger.getLogger(StepDefinition.class);
        PropertyConfigurator.configure("log4j.properties");
    }

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

}
