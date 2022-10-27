package TestNG_Framework;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    WebDriver driver;

    @Test
    //I am getting this info from PropertiesFile.xml
    @Parameters({"env","browser","url", "emailID"})
    public void yahooLoginTest(String env, String browser, String url, String emailID) {
        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver93.exe");
        driver = new ChromeDriver();
    }else if (browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "src//main//resources//geckodriver88.exe");
            driver = new FirefoxDriver();
        }
        driver.get(url);

        WebElement userName = driver.findElement(By.xpath("//*[@id='login-username']"));
        userName.clear();
        userName.sendKeys(emailID);
        driver.findElement(By.xpath("//*[@id='login-signin']")).click();
        WebElement passWord = driver.findElement(By.xpath("//*[@id='login-passwd']"));
        passWord.clear();
        passWord.sendKeys("hhbkjasd123");
    }//..................................






}//..........................................
