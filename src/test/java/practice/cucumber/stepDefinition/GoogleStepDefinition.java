package practice.cucumber.stepDefinition;

import Reusable_Classes.Reusable_Library_Cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class GoogleStepDefinition {
    WebDriver driver;

    @Given("^I Navigate to google home page$")
    public void GoogleHomePage() throws IOException, InterruptedException {
        driver = Reusable_Library_Cucumber.setDriver();
        driver.navigate().to("https://www.google.com");
    }//end of GIVEN

    @When("^I can write (.*) in the google search box$")
    public void searchFields(String cars){
    Reusable_Library_Cucumber.userKeys(driver,"//*[@name='q']",cars,"SearchBox");
    }//.................

    @When("^I can click on the search button$")
    public void click(){
        Reusable_Library_Cucumber.submit(driver,"//*[@name='btnK']","submit");
    }//.,................

    @When("^I can capture text and print result$")
    public void capturingText(){
        String result = Reusable_Library_Cucumber.captureText(driver,"//*[@id='result-stats']","CapturingtheText");
        String[] finalResult = result.split(" ");
        System.out.println("The result to be printed :"+finalResult[1]);

    }//................
    @When("^I can click on more Item$")
    public void clickMore(){
        Reusable_Library_Cucumber.click(driver,"//*[text()='More']","clickonMore");
    }//.............
    @Then("^I can select the books$")
    public void clickingOnBook(){
        Reusable_Library_Cucumber.click(driver,"//*[text()='Books' and @role='menuitem']","Books");


    }//......................



}//end of class
