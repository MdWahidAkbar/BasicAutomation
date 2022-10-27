package TestNG_Framework;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

    /*
    @Test(timeOut = 2000)
    public void infiniteLoopTest(){
    int i = 1;
    while (i==1){
        System.out.println(i);
    }

    }//..................

 */


    @Test(invocationTimeOut = 2000)
    public void infiniteLoopTest1(){
        int i = 1;
        while (i==1){
            System.out.println(i);
        }

    }//..................


}//....................................
