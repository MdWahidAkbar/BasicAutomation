package Udemy_TestScripts.Section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_AutoSuggestive {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver91.exe");
        WebDriver driver = new ChromeDriver();

        //Navigating to MakeMyTrip website
        driver.get("https://www.makemytrip.com");

        Thread.sleep(4000);


//----------------------------------------------------------------------------------------------
//NB:This script didn't run. All the elements are unique still it didn't run. Find out the reason
// ----------------------------------------------------------------------------------------------




        //Locating the source element
        try {
            WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
            //WebElement source = driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
            Thread.sleep(1500);
            source.clear();
            Thread.sleep(2000);
            source.sendKeys("MUM");
            Thread.sleep(1000);
            source.sendKeys(Keys.ENTER);
        }catch (Exception e){
            System.out.println("Unable to find the From box "+e);
        }//end of From box exception

        //Locating the destination element
        try {
            WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));
            Thread.sleep(1500);
            destination.clear();
            Thread.sleep(1500);
            destination.sendKeys("DEL");
            Thread.sleep(1500);

            //We want to have second one in the box
            destination.sendKeys(Keys.ARROW_DOWN);//also try this by loop to select the 5th one.
            Thread.sleep(1500);
            destination.sendKeys(Keys.ENTER);
        }catch (Exception e){
            System.out.println("Unable to find the To box "+e);
        }//end of To box exception







    }//end of Main Method

}//end of main class
