package Udemy_TestScripts.Section_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class MultipleProduct_70_73 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//resources//chromedriver93.exe");
        WebDriver driver = new ChromeDriver();

        int j=0;

        //Navigating to e commerces practice web site
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        //as it takes time to load
        Thread.sleep(3000);

        //As there is no unique value to find element Cucumber to add to card so we should do the following
        //I can find it by element by index i can do but if tomorrow the index changes then I can't find it.

        //see the Class SingleProduct.
        //If I want to add more than one product, the system would be following
        //I have to declare and define Array
        String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Brinjal","Potato"};


        //let store all the product name in a variable
        List<WebElement> product = driver.findElements(By.xpath("//*[@class='product-name']"));

        for (int i = 0; i < product.size(); i++) {

            //Cucumber - 1 Kg (Actual Vegi name)

            /////String name1 = product.get(i).getText();
            /////System.out.println("The product name ......:"+name1);
            //As the name contains Cucumber 1 kg so I need to split it to get the item name only
            //As it is related to index so I need to use []

            //Split based on space" "
            //String[] name = product.get(i).getText().split(" ");
            //String formatetName = name[0];

            //split based on "-"
            String[] name = product.get(i).getText().split("-");
            //identifying the vegi name and removing spaces from before or after
            String formatetName = name[0].trim();

            //convert array into arrayList for each search
            //check the name I extracted is present in arrayList or not
            List itemsNeededList = Arrays.asList(itemsNeeded);

            //Optional Line
            System.out.println("The name of the product is :"+formatetName);// it will print all the vegi names it iterates


            if (itemsNeededList.contains(formatetName)) {

                //It means j will increase or added 1 time each time it iterates
                j++;

/*
                //click on ADD TO CARD
                driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
                //as i sed 'text()' to select the element the following happens
                //I have to wait 5 second after each iteration done because after clicking on ADD TO CARD it turned into ADDED
                //and it takes 5 second to be ADD TO CART so before wait time it get the index of present ADD TO CART and select the wrong item
                //ass the first one get changed to ADDED.
*/

                //so i have to select value that can locate the ADD TO CARD without text
                //click on ADD TO CARD by other ways like parent to child method but 'text()'
                driver.findElements(By.xpath("//*//*[@class='product-action']/button")).get(i).click();

                //for ArrayList I can't use break.
                //also if I use 'break' then it will run until find the first vegi and once it finds then the the run will break
                //and will come out for loop so others items can't be found.
                //break;

/*
                //I have to fix the times it should run
                //I need to declare a 'int' with null value then take its help to stop iterate
                //if I want to iterates 3 times
                if (j==3) {
                    break;
                }//enf of if condition for break
*/

                //as each time i have to change the iteration number if I add new items in the array
                //so i can use the following to get the iteration number and can avoid hard code
                //i used ".length()" because I used array. If I used arrayList then I would use ".size()
                if (j==itemsNeeded.length){
                    break;
                }//enf of if condition for break



            }//end of if condition

//Thread.sleep(5000);//it is for locator 'text()'

        }//end of for loop


    }//end of main method


}//end of java class
