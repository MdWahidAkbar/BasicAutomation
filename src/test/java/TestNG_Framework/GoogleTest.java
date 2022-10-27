package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
    System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver93.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://google.com");

    }//end of ..........


    //By using priority the test will be serialed and with groups thests will be grouped in
    @Test(priority = 1,groups = "Title")
    public void googleTileTest(){
        String title = driver.getTitle();
        System.out.println("Name of page title is : "+title);
    }//end of ..........

    @Test(priority = 2, groups = "Logo")
    public void googleLogoTest(){
    boolean b = driver.findElement(By.xpath("//*[@class='lnXdpd']")).isDisplayed();

    if ( b == true){
        System.out.println("Logo is displayed ");
    }else {
        System.out.println("Logo is not displayed");
    }
    }//end of ..........

    @Test(priority = 3,groups = "Link Test")
    public void mailLinkTest(){

        boolean l = driver.findElement(By.linkText("Gmail")).isDisplayed();
        if ( l == true){
            System.out.println("gmail is displayed");
        }else {
            System.out.println("Gmail is not displayed");
        }

    }//end of ...........

    @Test(priority = 4,groups = "Test")
    public void test1(){
        System.out.println("Test1");

    }//end of ...............

    //This way we can skip a TC-------------------------
    @Test(enabled = false)
    public void testIgnore(){
        System.out.println("Test1");

    }//end of ...............

    @Test(priority = 5,groups = "Test")
    public void test2(){
        System.out.println("Test3");

    }//end of ...............

    @Test(priority = 6,groups = "Test")
    public void test3(){
        System.out.println("Test3");

    }//end of ...............



    @AfterMethod
    public void tearDown(){
        driver.quit();

    }//end of





}//end of main class
