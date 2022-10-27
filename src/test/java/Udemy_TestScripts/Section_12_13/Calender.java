package Udemy_TestScripts.Section_12_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calender {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src//Resource//chromedriver83.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Navigate to the path2usa website
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();


        //Clicking on date box
        WebElement element  = driver.findElement(By.xpath("//*[@name='travel_date']"));
        element.click();

 /*       //selecting 26th date of present month
        driver.findElement(By.xpath("//*[text()='26']")).click();
        //or
        //selecting future date date
        element.clear();
        element.sendKeys("08-25-2020");
  */

//if 'while(true)' then It will execute the below block until it becomes fasle. Once false
// then it stop working and if 'while(false)' vise versa of above line.
        //here I used negation "!". it means below false statement will return as true until I get the September.
        //once I get September then the statement will be true but Negation'!' will return as false
        // and stop executing and skip the 'while()' as I landed in my expected month September
        //so it will keep executing until the statement become false

      while (! driver.findElement(By.xpath("//*[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().contains("September")){

          driver.findElement(By.xpath("//*[@class='datepicker-days']//th[@class='next']")).click();

      }//end of while


        //Selecting June 28
        //selecting a common element that common to all the date
        List<WebElement> dates = driver.findElements(By.xpath("//*[@class='day']"));
        //getting the amount/count of total date
        int count = dates.size();

        System.out.println("Total number is "+count);//optional

        //grab the common attribute, put into List and Iterate(loop)
        for (int i = 0; i<count; i++){

            String text = driver.findElements(By.xpath("//*[@class='day']")).get(i).getText();

            //clicking on 29th date
            if (text.equalsIgnoreCase("29")){
                driver.findElements(By.xpath("//*[@class='day']")).get(i).click();
                break;
            }

        }//end of for loop



    }//end of main method


}//end of java class
