package Udemy_TestScripts.Section_14;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "src//Resource//chromedriver83.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https:www.google.com");

        //screenshot
        File sShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //

        FileUtils.copyFile(sShot, new File("src//Section_14//screenshot.png"));








    }//end of main method

}//end of java class
