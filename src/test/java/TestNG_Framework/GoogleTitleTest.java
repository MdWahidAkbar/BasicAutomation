package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTitleTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver93.exe");
        //System.setProperty("webdriver.chrome.driver","D://Resources for Automation//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://google.com");

    }//end of ..........


    //By using priority the test will be serialed and with groups thests will be grouped in
    @Test
    public void googleTileTest(){
        String title = driver.getTitle();
        System.out.println("Name of page title is : "+title);

        //"Title is not matched" is a message. It will be printed if TC fails
        Assert.assertEquals(title,"Google123", "Title is not matched");

    }//end of ..........

    @Test()
    public void googleLogoTest(){
        boolean b = driver.findElement(By.xpath("//*[@class='lnXdpd']")).isDisplayed();

        //If TC fail the message should be printed
        Assert.assertTrue(b, "The Logo does not match with expectation");
        //we can use below line too
        Assert.assertEquals(b, true, "The Logo does not match");

    }//end of ..........

    @AfterMethod
    public void tearDown(){
        driver.quit();

    }//end of






















}//........................
