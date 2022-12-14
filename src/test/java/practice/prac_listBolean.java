package practice;

import Reusable_Classes.Reusable_Library_Loggers;
import Reusable_Classes.prac_abstract;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class prac_listBolean extends prac_abstract {

    @Test
    public void yahooVerification() throws InterruptedException {
        logger.log(LogStatus.INFO, "Navigate to Yahoo home page");
        //navigate to yahoo home page
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(4000);
        //i want tp count all the links in yahoo home page and print it
        logger.log(LogStatus.INFO, "Getting the list count for all links");
        List<WebElement> linkCount = driver.findElements(By.xpath("//*[@class='_yb_76vqb ']"));
        //printing the total number of link under the ID
        logger.log(LogStatus.INFO, "Actual number of links are :" + linkCount.size());
        System.out.println("The total number of links are :" + linkCount.size());
        //verify if the lickCount returns you 12 links
        if (linkCount.size() == 13) {
            System.out.println("MY yahoo page link count matches and it it " + linkCount.size());
            logger.log(LogStatus.PASS, "MY yahoo page link count matches and it it :" + linkCount.size());
        } else {
            System.out.println("MY yahoo home page link count doesn't matches and actual is " + linkCount.size());
            logger.log(LogStatus.FAIL, "MY yahoo home page link count doesn't matches and actual is :" + linkCount.size());
        }//end of if else method
        //clicking on signin
        //Reusable_Library_Loggers.click(driver, "//*[@id='header-signin-link']", "Sign In",logger);
        //wrong xpath to verify screensot
        Reusable_Library_Loggers.click(driver, "//*[@class='_yb_qcy1r']", "Sign In",logger);
        //wait for few second
        Thread.sleep(3000);
        //veriifying the state of the checkbox is checked for stay sign in section
        boolean checkboxState = driver.findElement(By.xpath("//*[@id='persistent']")).isSelected();
        if (checkboxState == false) {
            System.out.println("Checkbox is not selected by default");
            logger.log(LogStatus.FAIL, "Checkbox is not selected by default");
        } else {
            System.out.println("Checkbox is selected by default");
            logger.log(LogStatus.PASS, "Checkbox is selected by default");
        }//end of if else



    }//end of Test method



}//end of java class
