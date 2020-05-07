package com.akshay.bdd.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebDriverListener implements WebDriverEventListener {

    private static Logger logger;

    WebDriverListener(){
        logger = Logger.getLogger(WebDriverListener.class);
        PropertyConfigurator.configure("log4j.properties");
    }

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        logger.debug("beforeAlertAccept");
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        logger.debug("afterAlertAccept");
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        logger.debug("afterAlertDismiss");
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        logger.debug("beforeAlertDismiss");
    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        logger.debug("beforeNavigateTo");
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        logger.debug("afterNavigateTo");
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        logger.debug("beforeNavigateBack");
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        logger.debug("afterNavigateBack");
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        logger.debug("beforeNavigateForward");
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        logger.debug("afterNavigateForward");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        logger.debug("beforeNavigateRefresh");
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        logger.debug("afterNavigateRefresh");
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        logger.debug("beforeFindBy");
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        logger.debug("afterFindBy");
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        logger.debug("beforeClickOn");
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        logger.debug("afterClickOn");
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        logger.debug("beforeChangeValueOf");
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        logger.debug("afterChangeValueOf");
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        logger.debug("beforeScript");
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
        logger.debug("afterScript");
    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
        logger.debug("beforeSwitchToWindow");
    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {
        logger.debug("afterSwitchToWindow");
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {
        logger.debug("onException");
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {
        logger.debug("beforeGetScreenshotAs");
    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {
        logger.debug("afterGetScreenshotAs");
    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {
        logger.debug("beforeGetText");
    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
        logger.debug("afterGetText");
    }
}
