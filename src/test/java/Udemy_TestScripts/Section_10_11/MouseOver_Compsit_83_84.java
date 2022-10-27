package Udemy_TestScripts.Section_10_11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Compsit_83_84 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//Resource//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Navigating to Amazon
        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();

        //mouse over to the 'Hello sign in, Account and List'
        Actions mouse = new Actions(driver);

        //Identifying the search button
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

        //writing 'hello' by using mose over method and make it capital and select the 'hello' in the box
        mouse.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        Thread.sleep(2000);

        //move the mouse to 'Hello sign in, Account and List'
        WebElement move = driver.findElement(By.cssSelector("[id='nav-link-accountList']"));


        //move the mouse to 'Hello sign in, Account and List'
        //here .build() means this statement is ready to execute and .perform() means execution
        mouse.moveToElement(move).build().perform();

        //double click on 'Hello sign in, Account and List'
        mouse.moveToElement(move).contextClick().build().perform();




    }//end of main method


}//end of java class

