package practice;

import Reusable_Classes.prac_abstract;
import Day2_04112020.Yahoo_Page_Object.prac_baseMethod;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class prac_pageObjectExecution extends prac_abstract {

    @Test
    public void pracYahooSearchResult() throws InterruptedException {
        logger.log(LogStatus.INFO,"Navigating to Yahoo home page");
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(3000);
        prac_baseMethod.pracYahooHomePage().pracSearchFields("cars");
        Thread.sleep(3000);
        prac_baseMethod.pracYahooHomePage().click();
        Thread.sleep(3000);
        prac_baseMethod.pracSearchResult().scrollDown();
        Thread.sleep(3000);
        prac_baseMethod.pracSearchResult().captureingTest();



    }




}//end of class
