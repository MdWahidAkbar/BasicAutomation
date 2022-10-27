package TestNG_Framework;

import org.testng.annotations.*;

public class TestNgBasics {


    //Pre-condition Annotation -- starting with @Before==================================
    @BeforeSuite//1
    public void setUp(){
        System.out.println("set up system property for chrome");

    }//wnd of .....

    @BeforeTest//2
    public void launchBrowser(){
        System.out.println("launchBrowser");

    }//end of .........

    @BeforeClass //3
    public void login(){
        System.out.println("login to app");

    }//end of ..........


    @BeforeMethod//4
    public void enterURL(){
        System.out.println("enter URL");

    }//end of.......


/*
Here @BeforeMethod @Test and @AfterMethod is paired all the time while executing the @Test
 */

    //Test Case -- starting with @Test================================================
    @Test//5
    public void googleTitleTest(){
        System.out.println(" --Google Title Test Case");

    }//end of ...........

    @Test
    public void searchTest(){
        System.out.println(" --Search Test");
    }//end of ..........

    @Test
    public void googleLogoTest(){
        System.out.println(" --googleLogoTest");
    }//end of ..........

    //Post-condition Annotation -- starting with @After===============================
    @AfterMethod//6
    public void logout(){
        System.out.println("Logout from app");

    }//end of ..........

    @AfterClass//7
    public void closeBrowser(){
        System.out.println("Close the browser");

    }//end of ..........

    @AfterTest//8
    public void deleteAllCookies(){
        System.out.println("Delete all cookies");

    }//end of ......


    @AfterSuite//9
    public void generateTestReport(){
        System.out.println("generateTestReport");

    }//end of ..........








}//end of main class
