package Day2_04112020.Yahoo_Page_Object;

import Reusable_Classes.prac_abstract;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class prac_baseMethod extends prac_abstract {

    public prac_baseMethod(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);

    }//end of .......

    public static prac_yahooHomePage pracYahooHomePage(){
        prac_yahooHomePage pracYahooHomePage = new prac_yahooHomePage(prac_abstract.driver);
        return pracYahooHomePage;
    }
    public static prac_searchResult pracSearchResult(){
        prac_searchResult pracSearchResult = new prac_searchResult(prac_abstract.driver);
        return pracSearchResult;
    }






}//end of class
