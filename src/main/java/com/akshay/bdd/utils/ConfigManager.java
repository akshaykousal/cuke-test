package com.akshay.bdd.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    private String configFile = System.getProperty("user.dir") + "\\src\\main\\resources\\configuration\\Config.properties";

    private Properties configProperties() throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(configFile);
        properties.load(fis);
        return properties;
    }

    public String getProperty(String propertyName) throws IOException {
        return configProperties().getProperty(propertyName);
    }

    public void setProperty(String propertyName, String propertyValue, String comment) throws IOException {
        configProperties().setProperty(propertyName, propertyValue);
        FileOutputStream fos = new FileOutputStream(configFile);
        configProperties().store(fos, comment);
    }

}
