package com.akshay.bdd.utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class WebDriverManager {

    final private String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe";
    final private String IE_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\IEDriverServer.exe";
    final private String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\geckodriver.exe";
    final private String PHANTOMJS_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\phantomjs.exe";

    private ConfigManager configManager = new ConfigManager();

    public WebDriver getDriver() throws IOException {

        String driverType = configManager.getProperty("browser");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        WebDriver driver;
        if (driverType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
            System.setProperty("webdriver.chrome.silentOutput", "true");
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", IE_DRIVER_PATH);
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability("ignoreProtectedModeSettings", true);
            dc.setCapability("silent", true);
            InternetExplorerOptions options = new InternetExplorerOptions(dc);
            driver = new InternetExplorerDriver(options);
        } else if (driverType.equalsIgnoreCase("phantomjs")) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setJavascriptEnabled(true);
            caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, PHANTOMJS_DRIVER_PATH);
//            caps.setCapability("takesScreenshot", true);
            driver = new PhantomJSDriver(caps);
        } else {
            System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH);
            driver = new FirefoxDriver();
        }
        //EventFiringWebDriver is wrapper around an arbitrary WebDriver instance which supports registering of a WebDriverEventListener for logging purpose
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        WebDriverListener driverListener = new WebDriverListener();
        eventFiringWebDriver.register(driverListener);
        eventFiringWebDriver.manage().window().maximize();
        eventFiringWebDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return eventFiringWebDriver; //i.e WebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
    }
}
