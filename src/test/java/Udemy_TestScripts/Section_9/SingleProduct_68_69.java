package Udemy_TestScripts.Section_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SingleProduct_68_69 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//resources//chromedriver91.exe");
        WebDriver driver = new ChromeDriver();


        //Navigating to e commerces practice web site
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        Thread.sleep(2000);

        driver.manage().window().maximize();

        //As there is no unique value to find element Cucumber to add to card so we should do the following
        //I can find it by element by index i can do but if tomorrow the index changes then I can't find it.

        //let store all the product name in a variable
        List<WebElement> product = driver.findElements(By.xpath("//*[@class='product-name']"));

        for (int i = 0; i < product.size(); i++) {

            String name = product.get(i).getText();

            System.out.println("The name of the product is :"+name);// it will print all the vegi name it iterates

            if (name.contains("Cucumber")) {
                driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();

                //break means it will stop iterating once it get the cucumber
                break;
            }


        }//end of for loop


    }//end of main method


}//end of java class
