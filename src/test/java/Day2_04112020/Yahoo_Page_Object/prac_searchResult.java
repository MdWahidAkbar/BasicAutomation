package Day2_04112020.Yahoo_Page_Object;

import Reusable_Classes.Reusable_Library_Loggers;
import Reusable_Classes.prac_abstract;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class prac_searchResult extends prac_abstract {

    ExtentTest logger;

    public prac_searchResult(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger  = super.logger;
    }//end of contractor

    public prac_searchResult scrollDown(){
        JavascriptExecutor jse = (JavascriptExecutor) prac_abstract.driver;
        logger.log(LogStatus.INFO,"successfully scrolled all way down");
        jse.executeScript("scroll(0,10000);");
        return new prac_searchResult(prac_abstract.driver);
    }//end of ...........

    public prac_searchResult captureingTest(){
        String result = Reusable_Library_Loggers.captureText(prac_abstract.driver,"//*[@class='compPagination']","",logger);
        String[] finalReslt = result.split("NEXT");
        System.out.println("My expected result is :"+finalReslt[1]);
        return new prac_searchResult(prac_abstract.driver);

    }//end of ..............





}//end of class
