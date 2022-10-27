package Udemy_TestScripts.Section_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class Implicit_Wait_Reusable_76 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//resources//chromedriver91.exe");
        WebDriver driver = new ChromeDriver();


        //Applying the implicit wait
        //If apply the Implicit wait then Pls make all the Explicit wait in comment mode
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //declaring the Explicit Wait
        //If apply the Explicit wait then Pls make all the Implicit wait in comment mode
        WebDriverWait wait = new WebDriverWait(driver, 5);

        //If I want to add more than one product, the system would be following
        //I have to declare and define Array
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Brinjal", "Potato"};

        //Navigating to e commerces practice web site
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        //as it takes time to load
        Thread.sleep(3000);

        driver.manage().window().maximize();

        //I can do to call the reusable method by this way.in this case I have make the method 'static'
        addItems(driver, itemsNeeded);


  /*      //or I can do the following to avoid the above method and I do not need to make the reusable method 'static'
        Implicit_Wait_Reusable_76 b = new Implicit_Wait_Reusable_76();
        b.addItems(driver, itemsNeeded);
*/

        //clicking on tha cart
        driver.findElement(By.xpath("//*[@alt='Cart']")).click();

        //clicking on proceed to checkout button
        driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();

        //applying explicit wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoCode']")));

        //clicking on enter promo code and send keys
        driver.findElement(By.xpath("//*[@class='promoCode']")).sendKeys("rahulshettyacademy");


        //Clicking on apply button
        driver.findElement(By.xpath("//*[@class='promoBtn']")).click();

        //applying explicit wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoInfo']")));


        //printing the Pro moCode apply messages in the console
        System.out.println(driver.findElement(By.xpath("//*[@class='promoInfo']")).getText());


    }//end of main method


    //I can use below method without static if I make the call method in main method 'className varialeName = new className();
    //public void addItems(WebDriver driver, String[] itemsNeeded){

    public static void addItems(WebDriver driver, String[] itemsNeeded) {

        int j = 0;

        //let store all the product name in a variable
        List<WebElement> product = driver.findElements(By.xpath("//*[@class='product-name']"));

        for (int i = 0; i < product.size(); i++) {

            //split based on "-"
            String[] name = product.get(i).getText().split("-");
            //identifying the vegi name and removing spaces from before or after
            String formatetName = name[0].trim();

            //convert array into arrayList for each search
            //check the name I extracted is present in arrayList or not
            List itemsNeededList = Arrays.asList(itemsNeeded);


            if (itemsNeededList.contains(formatetName)) {

                //It means j will increase or added 1 time each time it iterates

                j++;

                //so i have to select value that can locate the ADD TO CARD without text
                //click on ADD TO CARD by other ways like parent to child method but 'text()'
                driver.findElements(By.xpath("//*//*[@class='product-action']/button")).get(i).click();


                //as each time i have to change the iteration number if I add new items in the array
                //so i can use the following to get the iteration number and can avoid hard code
                //i used ".length()" because I used array. If I used arrayList then I would use ".size()
                if (j == itemsNeeded.length) {
                    break;
                }//enf of if condition for break


            }//end of if condition


        }//end of for loop


    }//end of addItems method


}//end of java class
