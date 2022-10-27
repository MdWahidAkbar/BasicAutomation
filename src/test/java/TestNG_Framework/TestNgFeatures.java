package TestNG_Framework;

import org.testng.annotations.Test;

public class TestNgFeatures {

    @Test
    public void loginTest(){
        System.out.println("loginTest");
        //to make the TC fail. Because 9 can;t be divided by 0
        int i = 9/0;

    }//end of .....................

    @Test(dependsOnMethods = "loginTest")
    public void homePageTest(){
        System.out.println("homePageTest");

    }//end of .....................


    @Test(dependsOnMethods = "loginTest")
    public void searchPageTest(){
        System.out.println("searchPageTest");

    }//end of .....................

    @Test(dependsOnMethods = "loginTest")
    public void regPageTest(){
        System.out.println("regPageTest");

    }//end of .....................






















}//end of main class.........................
