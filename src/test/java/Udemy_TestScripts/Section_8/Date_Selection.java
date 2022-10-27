package Udemy_TestScripts.Section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Selection {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver91.exe");
        WebDriver driver = new ChromeDriver();

        //Navigating to spicejet website
        driver.get("https://www.spicejet.com");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);


        Thread.sleep(2000);
        //Clicking on From box
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        Thread.sleep(2000);
        //selecting source location from 'From' box
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);

        //selecting destination from 'To' box
        //as we selected source from box so the to box has automatically selected so we do not select it again
        //here we have to use[2] because there are 2 items in the same attributes. So we need to use number to locate specific one
        //some company do not like to useNumber to locate
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        //Locating the element by Parent Child Relationship way
        //All company like this way to locate
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

        Thread.sleep(2000);


        //selecting the current date
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();






    }//end of main method


}//end of class
