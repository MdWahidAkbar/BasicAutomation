package Reusable_Classes;

import Reusable_Classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class prac_abstract {
    //declaring the variables
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;

    @BeforeSuite
    public void callDriver(){
        //driver = Reusable_Library_Loggers.setDriver();
        reports = new ExtentReports("src//test//java//practice//report.html",true);
    }//end of before suit

    @BeforeMethod
    //public void getMethodName(Method TestName){
    @Parameters("Browser")
    public void getMethodName(Method TestName, String Browser){
       if (Browser.equalsIgnoreCase("chrome")){
        driver = Reusable_Library_Loggers.setDriver();
       }else if (Browser.equalsIgnoreCase("Firefox")){
           System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver64.exe");
          driver = new FirefoxDriver();
       }

        logger = reports.startTest(TestName.getName());

    }//end of before method

    @AfterMethod
    public void endTest(){
        reports.endTest(logger);

    }//end of AfterMethod

    @AfterSuite
    public void quitInfo(){
        reports.flush();

    }//end of After suit


}//end of java class
