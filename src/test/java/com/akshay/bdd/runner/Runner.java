package com.akshay.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.akshay.bdd.stepDefinitions",
        format = {"pretty", "html:target/report"}
)
public class Runner {
}
