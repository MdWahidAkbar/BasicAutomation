package Udemy_TestScripts.Section_10_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SwitchToWindows_85_87 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src//resources//chromedriver91.exe");
        WebDriver driver = new ChromeDriver();

        //Navigating to Accounts.Google.com
        driver.get("https://accounts.google.com/signup");
        driver.manage().window().maximize();

        System.out.println("Title before switching to child :" + driver.getTitle());

        //Clicking on the help
        driver.findElement(By.xpath("//*[text()='Help']")).click();

/*
        //Simple way to maintain multiple windows

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        //Switching to child tab
        driver.switchTo().window(tabs.get(1));

        System.out.println("Title after switching to child :"+driver.getTitle());

        //Switching back to parent tab
        driver.switchTo().window(tabs.get(0));

        System.out.println("Title after switching back to parent :"+driver.getTitle());
*/

        //declaring and defining the 'Set' as like 'ArrayList'
        Set<String> Tabs = driver.getWindowHandles();

        //call for iterating the tabs. By default it start from the top means before parent tabs
        Iterator<String> Tabs_1 = Tabs.iterator();

        //Then call for going to parent tabs as by default it start from top
        String parentTabs = Tabs_1.next();

        //Then call for going to child tab
        String childTabs = Tabs_1.next();

        //Switching to child tab
        driver.switchTo().window(childTabs);

        System.out.println("Title after switching to child :" + driver.getTitle());

        //Switching back to parent tab
        driver.switchTo().window(parentTabs);

        System.out.println("Title after switching back to parent :" + driver.getTitle());


    }//end of main method


}//end of java class
