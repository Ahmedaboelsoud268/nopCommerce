package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "C:\\Users\\20103\\IdeaProjects\\demonopcommerce\\src\\main\\resources",
        glue = {"org.example.stepDefs"},
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@smoke"
)
public class runners extends AbstractTestNGCucumberTests {
}