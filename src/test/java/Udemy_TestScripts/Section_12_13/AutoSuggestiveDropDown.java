package Udemy_TestScripts.Section_12_13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//Resource//chromedriver83.exe");
        WebDriver driver = new ChromeDriver();

        //Navigating to makemytrip website
        //driver.navigate().to("https://www.makemytrip.com/");
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();

        /*
        //-------auto suggestive dropdown is not working on makeMyTrip website so I used google to solve it-----------

        WebElement from = driver.findElement(By.id("fromCity"));
        Thread.sleep(2000);
        from.sendKeys("MUM");
        Thread.sleep(5000);
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);
         */

        //finding and typing 'merce' in the google search box
        WebElement searchBox = driver.findElement(By.xpath("//*[@name='q']"));
        Thread.sleep(3000);
        searchBox.click();
        searchBox.sendKeys("merce");
        Thread.sleep(3000);


        //I am selecting 6th one from the auto suggestive dropdown list that is 'Mercedes amg'
        //I could use below statement for 6 time but it is not good practice
        //searchBox.sendKeys(Keys.ARROW_DOWN); //6 times needed

        for (int i = 0; i<6; i++){
//I used for loop to arrow down 6 times to reach the target 'mercedes amg'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ARROW_DOWN);

        }//end of for loop

        Thread.sleep(1500);
        //enter key to go to the selected item
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(1500);
        //clicking on 'Images'
        driver.findElement(By.xpath("//*[text()='Images']")).click();



        Thread.sleep(3000);
        driver.quit();


    }//end of main method

}//end of java class
