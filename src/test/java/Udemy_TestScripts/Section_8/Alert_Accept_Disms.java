package Udemy_TestScripts.Section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Accept_Disms {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//resources//chromedriver91.exe");
        WebDriver driver = new ChromeDriver();

        //Navigating to rahul shetty acadey for testing
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        //Locating the enter name box
        driver.findElement(By.id("name")).sendKeys("Wahid Akbar");

        Thread.sleep(2000);


        //Clicking on Alert button
        //driver.findElement(By.cssSelector("[id='alertbtn']")).click();
        driver.findElement(By.cssSelector("#alertbtn")).click();


        //getting the text on alert popun in the console
        System.out.println(driver.switchTo().alert().getText());

        Thread.sleep(2000);

        //Clicking on the OK button in the alert popup
        driver.switchTo().alert().accept();

        Thread.sleep(2000);

        //Clicking on Confirm button
        driver.findElement(By.xpath("//*[@id='confirmbtn']")).click();

        //Getting the text of the popup
        System.out.println(driver.switchTo().alert().getText());

        Thread.sleep(2000);


        //clicking on to accept the message
        //driver.switchTo().alert().accept();


        //clicking on to not accept the message
        driver.switchTo().alert().dismiss();


    }//end of main method

}//end of Alert Accept and Dismiss
