package Action_Items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class TD_Bank {
    public static void main(String[] args) throws InterruptedException {
        //Webdriver directives
        System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver83.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //------------------open google
            driver.get("https://www.td.com");
            Thread.sleep(2000);
            driver.manage().window().maximize();
            Thread.sleep(2000);


        //call your Mouse Actions
        Actions mouse = new Actions(driver);

            //Clicking on Product tab
           WebElement product = driver.findElement(By.xpath("//a[@id='td-desktop-nav-dropdown-link-4']"));

            //Calling my mouse to go over the Log In
            mouse.moveToElement(product).perform();

           //Clicking on Online Banking
           driver.findElement(By.linkText("Online Banking")).click();

        //noe define ArrayList to handle all current windows tab that are open
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        //Switch to second tabs
        driver.switchTo().window(tabs.get(1));

            //Getting input into User Id, Password and clicking on Log in
           driver.findElement(By.xpath("//*[@name='psudoUsername']")).sendKeys("LionelMessi");
           driver.findElement(By.xpath("//*[@name='password']")).sendKeys("LionelMessi123");
           driver.findElement(By.xpath("//*[text()='Log in']")).click();

           Thread.sleep(2000);
           //Clicking on Forget Password
        driver.findElement(By.linkText("Forgot user name and/or password?")).click();

        //Clicking on I Forgot my user name and Password
        driver.findElement(By.xpath("//*[contains(text(),'I forgot my user name and password')]")).click();

        //Giving input into SSN
        driver.findElement(By.xpath("//*[@name='ssn']")).sendKeys("526-52-6587");

        //selecting account type by select method
        WebElement element = driver.findElement(By.xpath("//*[(@name='accountType')]"));
        Select dDown = new Select(element);
        dDown.selectByVisibleText("Checking or money market account");

        //Entering the account number
        driver.findElement(By.xpath("//*[@name='accountNumber']")).sendKeys("54541584545187458");

        //clicking on the submit tab
        driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();

        Thread.sleep(2000);
        driver.close();

        //Switching to the parent tab
        driver.switchTo().window(tabs.get(0));

        Thread.sleep(2000);
        driver.quit();




    }//end of the method

}//end of the java class
