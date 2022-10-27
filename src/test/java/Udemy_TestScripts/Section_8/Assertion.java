package Udemy_TestScripts.Section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Assertion {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver91.exe");
        WebDriver driver = new ChromeDriver();


        //Navigating to spicejet website
        driver.get("https://www.spicejet.com");
        Thread.sleep(2000);

        driver.manage().window().maximize();


        //As we have not select and click so it will be false. Pls see the comment on 27 line.
        //applying 'Assert' to validate if it is passed or failed.If passes the nothing will be shown
        //if failed then the script will not run and show the not found in console.
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        //Printing the false in the console
        System.out.println((driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()));

        //selecting the senior citizen check box
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        //finding if it has been selected.
        //if it is selected then it will print 'true'. If not then it will print 'false'.
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //applying 'Assert' to validate if it is passed or failed.
        //if failed then the script will not run and show the not found in console.
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());


        //counting how many check box are on the page
        //we have to select attribute and value that is common in all boxes.
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        //applying 'Assert' to validate if it is equal or not.if equal the the script will run
        //if failed then the script will not run and show the not found in console.
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "Adult1");
        //now I want to print the text in passengers box, that is : 'Adult1'
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());



    }//end of main method

}//end of Assert Class
