package Day2_04112020.Yahoo_Page_Object;

import Reusable_Classes.Reusable_Library_Loggers;
import Reusable_Classes.prac_abstract;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class prac_yahooHomePage extends prac_abstract {

    ExtentTest logger;

    public prac_yahooHomePage(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of contractor

    public prac_yahooHomePage pracSearchFields(String userInput){
        Reusable_Library_Loggers.userKeys(prac_abstract.driver,"//*[@id='ybar-sbq']",userInput,"Search Field",logger);
        return new prac_yahooHomePage(prac_abstract.driver);
    }//end of................

    public prac_yahooHomePage click(){
        Reusable_Library_Loggers.click(prac_abstract.driver,"//*[@id='ybar-search']","Clicking",logger);
    return new prac_yahooHomePage(prac_abstract.driver);
    }//end of ................




}//end of class
