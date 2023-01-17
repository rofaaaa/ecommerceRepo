package org.example.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
           features="src/main/resources/features",
                glue="org.example.stepDefs",
                tags="@smoke",
                plugin = {"pretty",
                        "html:target/cucumber.html",
                        "json:target/cucumber.json",
                        "junit:target/cucumber.junit",
                        "rerun:target/rerun.txt"
                }


        )
public class runner extends AbstractTestNGCucumberTests {
}
