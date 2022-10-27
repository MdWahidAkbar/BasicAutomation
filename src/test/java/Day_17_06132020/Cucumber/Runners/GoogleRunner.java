package Day_17_06132020.Cucumber.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)//this refers to your step definition class
@CucumberOptions(
            features = {"src/test/java/Day_17_06132020/Cucumber/Features/Google_Test.feature"},
            glue = {"Day_17_06132020.Cucumber.Step_Definitions"},
            plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}


)//array of arguments you are passing




public class GoogleRunner {
    //this will remain empty all the time

}//end of GoogleRunner
