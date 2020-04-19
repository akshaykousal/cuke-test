package com.akshay.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    private WebElement eleEmail;

    @FindBy(id = "Password")
    private WebElement elePassword;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;

    public void setEmail(String email) {
        eleEmail.clear();
        eleEmail.sendKeys(email);
    }

    public void setElePassword(String password) {
        elePassword.clear();
        elePassword.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

}
