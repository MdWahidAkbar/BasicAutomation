package Udemy_TestScripts.Section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_and_count {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src//Resource//chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //Navigating to spicejet website
        driver.get("https://www.spicejet.com");
        Thread.sleep(2000);

        //As we have not select and click so it will be false. Pls see the comment on 26 line.
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        //selecting the senior citizen check box
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();


//Optional---------------------------------------------------------------------------------------------
        //Practice to select all the boxes serially by using loop.



        //finding if it has been selected.
        //if it is selected then it will print 'true'. If not then it will print 'false'.
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        //counting how many check box are on the page
        //we have to select attribute and value that is common in all boxes.
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());




    }//end of main method

}//end of class
