package Udemy_TestScripts.Section_12_13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//---------------------Test case----------------------------------
//Enter the letter BENG
//Verify is Airport option is displayed in the suggestive box


public class Java_Script_Executor {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//Resource//chromedriver83.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://ksrtc.in");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
        Thread.sleep(1500);

 /*
 //-------------I no longer need it as I used it in while loop below.------------
 //if i use these syntax then only target airport 'BENGALURU AIRPORT' will be shown not all airport that loop run---------

 //driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

        System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText()); //the contents are
        // hidden so we have to use JavascriptExecutor to get the contents
 */


        //Javascript DOM can extract hidden elements
        //because Selenium cannot identify the hidden element--(Ajax implementation)
        //investigate the properties of object if it have any hidden text

        // JavascriptExecutor
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("scroll(0,300)");//this for scrolling only


        //in Javascript driver.findElement(By.id("")=document.getElementById(""). Pls see the "W3School" for details

        //as "" is not allowed in another "" in selenium
        //so i have to use forward 2 slash \"\" to avoid the error
        //also "sout = return" in JavascriptExecutor. here "return" needs here to store the value in the String"
        String script = "return document.getElementById(\"fromPlaceName\").value;";

        //jse.executeScript needs to execute the earlier made String statement on line 44
            //jse.executeScript(script);
        //as this is a string so i am putting this value in a String.(String) will come from the error sign so click on cast to
        String text = (String) jse.executeScript(script);
//printing the text in the console
        System.out.println(text);

        //I need to find whether "BENGALURU AIRPORT" is present or not in the dropbox
        //we know "while(true)" the loop will continue until it comes false
                //while (true) {
                //}//end of while
        //as BENGALURU AIRPORT is not at the first so the while will be false and it will stop looping but we have to
        //run this until we find BENGALURU AIRPORT. so we will use 'negation' '!'. It means '!false' is true and '!true ' is false
        // so i put '!false' which will be treated as true and loop keep running
        // so it will keep running. finally we will reach BENGALURU AIRPORT and this will be false so the loop will stop

 /*
 //-----------if element BENGALURU AIRPORT is found then the below coding is fine--------------------

 while (!text.equalsIgnoreCase("BENGALURU AIRPORT")){
            driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
            //script = "return document.getElementById(\"fromPlaceName\").value;";//optional
            //jse.executeScript needs to execute the earlier made String statement on line 44
            text = (String) jse.executeScript(script);
            //printing the all the texts it loops in the console
            System.out.println(text);

        }//end of while loop
  */

        //-----------if element BENGALURU AIRPORT is not found then the below coding will be for testing--------------------

        int i = 0; //i declare it to make fixed running the loop

        while (!text.equalsIgnoreCase("BENGALURU 1111 AIRPORT")){

            i++; //increment will be 1 easch time and added 1 each time

            Thread.sleep(500);

            driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
            //script = "return document.getElementById(\"fromPlaceName\").value;";//optional
            //jse.executeScript needs to execute the earlier made String statement on line 44
            text = (String) jse.executeScript(script);
            //printing the all the texts it loops in the console
            System.out.println(text);
            if (i>10){  //if loop runs till 10 times still not found then break the running loop
                break;
            }//end of if for break


        }//end of while loop


        if (i>10){ //this is final result whether the BENGALURU AIRPORT found or not. If after running
            // 10 times but still not found the BENGALURU AIRPORT then "Element not found" will be printed.
            //let make spelling in the BENGALURU AIRPORT to see the result. I added 1111 to make it spelling mistake
            System.out.println("Element not found");
        }else {
            System.out.println("Element found");

        }//end of if else




    }//end of main method

}//end of java class
