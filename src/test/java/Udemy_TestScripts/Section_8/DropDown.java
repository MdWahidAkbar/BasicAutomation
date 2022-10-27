package Udemy_TestScripts.Section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver91.exe");
        WebDriver driver = new ChromeDriver();

        //Navigating to spicejet website
        driver.get("https://www.spicejet.com");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(3000);


/*
        //defining the select option
        driver.findElement(By.id("divpaxinfo")).click();

        Select passengrs = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));


        //Calling the select to find the data by Value,Index and Visible text serially
        passengrs.selectByValue("4");
        Thread.sleep(2000);
        passengrs.selectByIndex(7);
        Thread.sleep(2000);
        passengrs.selectByVisibleText("5");
        Thread.sleep(2000);
        //deselecting the last one and go back to Index one.
        //currently Spicejet does not support the deselect option so the below statement will not work
        //passengrs.deselectByVisibleText("5");
 */
        Thread.sleep(2000);
        //Clicking on From box
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        //selecting from To box

        //here we have to use[2] because there are 2 items in the same attributes. So we need to use number to locate specific one
        //some company do not like to useNumber to locate
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        //Locating the element by Parent Child Relationship way
        //All company like this way to locate
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();






    }//end of main method

}// end of the class
