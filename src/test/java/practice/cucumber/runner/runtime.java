package practice.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class )
@CucumberOptions(
        features = {"src/test/java/practice/cucumber/feature/pracGoggleTest.feature"},
        glue = {"practice.cucumber.stepDefinition"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}
)




public class runtime {
}
