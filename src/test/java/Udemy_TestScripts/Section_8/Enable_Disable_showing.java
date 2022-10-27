package Udemy_TestScripts.Section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Enable_Disable_showing {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver91.exe");
        WebDriver driver = new ChromeDriver();

        //Navigating to spicejet website
        driver.get("https://www.spicejet.com");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

  /*      //Just to check if it works.finding whether if 'Return Date' box enable or not. It should not run the script
        //But the Script ran so 'isEnable' didnt work here. Some case It does not work so we need to follow different way
        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

        //locating the radio button 'Round Trip'
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        //finding whether if 'Return Date' box enable or not
        //this is not best option to verify Enable/Disable option
        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
 */


        //printing the value of attributes which get changed as clicking the radio button
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        Thread.sleep(2000);

        //Clicking the radio button on 'Round Trip'
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        //Printing again the value of attributes which get changed as clicking the radio button
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        //finding the true or false by applying IF ELSE condition
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("The Return Date box is Enable. so the Test is Passed ");
            Assert.assertTrue(true);
        }else {
            System.out.println("The Return Box is Disabled, So the Test is Failed");
            Assert.assertTrue(false);
        }//end of if else condition








    }//END OF MAIN METHOD

}//END OF CLASS
