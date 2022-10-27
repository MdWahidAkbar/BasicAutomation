package Day_17_06132020.Cucumber.Step_Definitions;


import Reusable_Classes.Reusable_Library_Cucumber;
import com.cucumber.listener.Reporter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Google_Search_Test_Scenarios {


    WebDriver driver;

    //the annotations gherkin methods @Given, @When, @And, @Then

    //if it fails, if we use try catch my report will never show fail although
    //i will see the exception.
    //If I want to see my test fail then take out try and catch from all of my Reusable library method
    //and use only explicit wait

    @Given("^I Navigate to google home page$")
    public void navigate() throws IOException, InterruptedException {

        driver = Reusable_Library_Cucumber.setDriver();
        driver.navigate().to("https://www.google.com");

    }//end of given

    @When("^I Enter a keyword (.*) on the search field$")
    public void searchField(String Cars){

        Reusable_Library_Cucumber.userKeys(driver,"//*[@name='q']",Cars,"Search Field");

    }//end of search field

    @When("^I click the search icon$")
    public void searchIcon(){

       Reusable_Library_Cucumber.submit(driver,"//*[@name='btnK']","Search Icon");

    }//end of search icon

    @When("^I capture search result and print it$")
    public void searchResult() throws InterruptedException {

        Thread.sleep(2000);
        String result = Reusable_Library_Cucumber.captureText(driver,"//*[@id='result-stats']","Capture Text");
        String[] arrayResult = result.split(" ");
        Reporter.addStepLog("My Search Number is "+arrayResult[1]);

    }//end of search result

    @When("^I click on More icon$")
    public void moreIcon(){

        Reusable_Library_Cucumber.click(driver,"//*[text()='More']","More Icon");

    }//end of More icon

    @Then("^I can select the value (.*)$")
    public void moreValue(String More) throws InterruptedException {

        Thread.sleep(3000);
        Reusable_Library_Cucumber.click(driver,"//*[text()='Books' and @role='menuitem']","More Value");

    }//end of More Value







}//end of test
