package Reusable_Classes;

import com.cucumber.listener.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.IOException;

public class Reusable_Library_Cucumber {

    static int timeout = 20;


    //method to re use chrome driver and chrome options
    public static WebDriver setDriver() throws InterruptedException, IOException {
        //kill all chrome driver instance
        Thread.sleep(3000);
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver93.exe /T");
        Thread.sleep(3000);
        //set the chrome path
        System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver89.exe");
        //set some pre conditions using ChromeOptions
        ChromeOptions options = new ChromeOptions();
        //set the arguments you want for the driver
        options.addArguments("start-maximized","incognito");
        //now simply define your chrome driver
        WebDriver driver = new ChromeDriver(options);

        return driver;
    }//end of setDriver method

    //method to compare expected with actual title
    public static void verifyTitle(WebDriver driver,String expectedTitle){
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Expected title matches with Actual " + expectedTitle);
        } else {
            System.out.println("Expected doesn't match actual title. Actual title is " + actualTitle);
        }
    }//end of verify title method


    //method to select a drop down value by visible text
    public static void dropdownByText(WebDriver driver,String locator, String userInput, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);

            System.out.println("Selecting a value on element " + elementName);
            Reporter.addStepLog("Selecting a value on element "+ elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            Select dDown = new Select(element);
            dDown.selectByVisibleText(userInput);

    }//end of drop down by text method

    //method to enter user input on send keys
    public static void userKeys(WebDriver driver,String locator, String userInput, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
            System.out.println("Entering a value on element " + elementName);
            Reporter.addStepLog("Entering a value on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            //element.click();
            element.clear();
            element.sendKeys(userInput);

    }//end of sendkeys method

    //method to click on an element
    public static void click(WebDriver driver,String locator,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);

            System.out.println("Clicking on element " + elementName);
            Reporter.addStepLog("Clicking on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.click();

    }//end of click method

    //method to submit on an element
    public static void submit(WebDriver driver,String locator,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);

            System.out.println("Submitting on element " + elementName);
            Reporter.addStepLog("Submitting on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.submit();

    }//end of click method

    //method to return text from an element
    public static String captureText(WebDriver driver,String locator,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        String result = null;
            System.out.println("Capturing a text from element " + elementName);
            Reporter.addStepLog("Capturing a text from element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            result = element.getText();
            System.out.println("My Text result is " + result);

        return result;

    }//end of capture text method





}//end of java class