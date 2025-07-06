package org.example.runner;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.example.steps",
        plugin={"pretty","json:target/cucumber-report/cucumber.json"}
)
public class TestRunner {
}
