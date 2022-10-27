package Udemy_TestScripts.Section_10_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Test_88_89 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src//Resource//chromedriver83.exe");
        WebDriver driver = new ChromeDriver();

        //Navigating to the site
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//*[@id='draggable']")).click();

        //we need to command selenium to find and go to frame as frame is not a part of HTML code.
        //this is way to get frame by WebElement. There are two more ways to find frame
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));

 /*       //find and go to frame by using index. Here we need to confirm how many frame are in the page
        //we need to find how many frame are in the page by following way.use either 'iframe' or 'frameset'.
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        //we got that there is only 1 frame in the page so the index number will be '0'
        driver.switchTo().frame(0);

        //find and go to frame by using ID. Here the frame has to have ID to use this
        //driver.switchTo().frame("id from html DOM");
*/
        //declaring and defining the mouse Action
        Actions mouse = new Actions(driver);

        //declaring and defining the source element
        WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));

       //declaring and defining the target element
        WebElement target =  driver.findElement(By.xpath("//*[@id='droppable']"));

       //commanding mouse action to drag from sources to target
        mouse.dragAndDrop(source,target).build().perform();

        //now commanding selenium to come out of frame to test other element of the page
        driver.switchTo().defaultContent();

        //clicking on the accept. as tagName starts with Anchor a so i used linkText to find and click
        driver.findElement(By.linkText("Accept")).click();




    }//end of main method

}//end of java class
