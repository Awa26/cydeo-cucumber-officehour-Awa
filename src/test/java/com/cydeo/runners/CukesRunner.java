package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-report.html"},//especially for reports
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false, // in oder to get snippets we make it true; And in order to run our code we make it false
        tags = " ", // inorder to generate public link for reports
        publish = true// in order to generate public link for reports



)






public class CukesRunner {
}
