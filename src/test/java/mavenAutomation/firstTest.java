package mavenAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver91.exe");

        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://www.google.com");

        driver.manage().window().maximize();


        System.out.println("The Page tittle is: "+driver.getTitle());


        Thread.sleep(3000);

        driver.quit();







    }//end of main method


}//end of java class
