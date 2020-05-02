package com.akshay.bdd.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebDriverListener implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("beforeAlertAccept");
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("afterAlertAccept");
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("afterAlertDismiss");
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("beforeAlertDismiss");
    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("beforeNavigateTo");
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("afterNavigateTo");
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        System.out.println("beforeNavigateBack");
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("afterNavigateBack");
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        System.out.println("beforeNavigateForward");
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("afterNavigateForward");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("beforeNavigateRefresh");
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("afterNavigateRefresh");
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("beforeFindBy");
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("afterFindBy");
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("beforeClickOn");
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("afterClickOn");
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("beforeChangeValueOf");
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("afterChangeValueOf");
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        System.out.println("beforeScript");
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
        System.out.println("afterScript");
    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("beforeSwitchToWindow");
    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("afterSwitchToWindow");
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {
        System.out.println("onException");
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {
        System.out.println("beforeGetScreenshotAs");
    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {
        System.out.println("afterGetScreenshotAs");
    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {
        System.out.println("beforeGetText");
    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
        System.out.println("afterGetText");
    }
}
