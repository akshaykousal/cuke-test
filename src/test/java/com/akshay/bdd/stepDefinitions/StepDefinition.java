package com.akshay.bdd.stepDefinitions;

import com.akshay.bdd.pages.DashboardPage;
import com.akshay.bdd.pages.LoginPage;
import com.akshay.bdd.utils.ConfigManager;
import com.akshay.bdd.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class StepDefinition {

    static WebDriver driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    ConfigManager configManager = new ConfigManager();

    public StepDefinition() {
        WebDriverManager driverManager = new WebDriverManager();
        try {
            if (StepDefinition.driver == null) {
                StepDefinition.driver = driverManager.getDriver();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
