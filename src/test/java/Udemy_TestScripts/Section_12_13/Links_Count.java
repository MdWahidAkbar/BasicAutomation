package Udemy_TestScripts.Section_12_13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Links_Count {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//resources//chromedriver91.exe");
        WebDriver driver = new ChromeDriver();

        //Navigating
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        //STEP-1
        //Printing the total no of links in the page
        System.out.println(driver.findElements(By.tagName("a")).size());

        //STEP-2
        //printing the total links in the footer section
        //Locating the whole footer section first
        //limiting the webDriver scope
        WebElement footerDriver = driver.findElement(By.xpath("//*[@id='gf-BIG']"));

        //printing the total no of links in the footer section
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        //STEP-3
        //printing the total links in the first column of footer section
        //Locating the whole first column of footer section first
        //limiting the webDriver scope
        WebElement columnDriver = footerDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));

        //printing the total number of links in the first column of footer section
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        //STEP-4
        //Check each links in the column and check the windows are opening

        for (int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++){

            //press control button and click will open new separate tab
            String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);

            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);

            Thread.sleep(4000);

        }// end of for loop

        //define the set for windows handles
        Set<String> tabs = driver.getWindowHandles();

        //command for iterating
        Iterator<String> it = tabs.iterator();

        while (it.hasNext()){

            driver.switchTo().window(it.next());
            System.out.println("Name of page title is :" +driver.getTitle());

            Thread.sleep(2000);

        }//end of while








    }//end of main method

}//end of java class
