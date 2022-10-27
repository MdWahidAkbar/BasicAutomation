package Udemy_TestScripts.Section_6_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lecture_24_25 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver91.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com");
        //driver.get("https:/google.com");
        driver.manage().window().maximize();//navigating to google site
        System.out.println(driver.getTitle());//validating page title is correct
        System.out.println(driver.getCurrentUrl());//verifying we landed on correct site/url.
        //System.out.println(driver.getPageSource());//if right click is disable in website we can do this to get page source

        driver.get("https://yahoo.com");//navigating to another website
        Thread.sleep(2000);
        driver.navigate().back();//and getting back to google again.
        Thread.sleep(2000);
        driver.navigate().forward();//forward to yahoo again.
        Thread.sleep(2000);
        driver.close();//it closes the current browser
        //as we have only one window in this test so 'close' is fine in this script
        //driver.quit();//it closes all the browser opened by selenium script


    }
}
