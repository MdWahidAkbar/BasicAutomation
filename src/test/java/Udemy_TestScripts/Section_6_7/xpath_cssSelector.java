package Udemy_TestScripts.Section_6_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_cssSelector {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src//Resource//chromedriver.exe");
        WebDriver driver = new ChromeDriver();



                /*
        driver.get("http://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("hellow");
        driver.findElement(By.name("pw")).sendKeys("1234");
        //driver.findElement(By.className("button r4 wide primary")).click();//error because class name can't have space.
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
        */



                //realtime example for all way of xpath & css


        //driver.get("https://facebook.com");
        //driver.manage().window().maximize();

        //general locating
            //driver.findElement(By.id("email")).sendKeys("MyNameIsMdWahidAkbar");
            //driver.findElement(By.name("pass")).sendKeys("123456789");
        // this time I am clicking on forget password
        //If tag is anchor 'a' so it is a link. we can use text to locate.
            //driver.findElement(By.linkText("Forgot account?")).click();




   /*         //for xpath---------------------------------------------------------------------------------

            //the syntax is : //tagName[@attribute='value']
            //here we can use * instead of using tagName
            driver.findElement(By.xpath("//*[@type='email']")).sendKeys("abcdef");
            driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
            //driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
            driver.findElement(By.xpath("//input[@value='Log In']")).click();

            //if the value of attribute is alphaNumeric which might be changeable we can use following syntax for XPATH
            // syntax is : //tagName[contains(@attribute,'full or part of constant VALUE')]
            // for text : //ragName[text()='whole text of the element including all space before,after and in between']

            //Parent to child: it is like absolute xpath
            //travers back to parent: //*[@Attribute='value']/parent::tagName.
            //travers to sibling: //*[@Attribute='value']following-sibling::tagName[2]//if there is more than one siblings.

    */




   /*
            //for cssSelector-----------------------------------------------------------------------------------

            // syntax is : tagName[attribute='value'] It is regular CSS Selector expression.
             // here if we don't want to use tagName then no need to put anything.see the statement 3 below
            //if I get ID the we can use simple syntax: tagName#id or #id But it will work only for ID.
            // another CSS is : tagName.className or .classname

            driver.findElement(By.cssSelector("input[name='email']")).sendKeys("akjhdksj");
            driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("akjhdksj");
            driver.findElement(By.cssSelector("[value='Log In']")).click();

            //if the value of attribute is alphaNumeric which might be changeable we can use following syntax for CSS
            //syntax will be same as regular css syntax but just put * after attribute
            // syntax is : tagName[attribute*='full or part of VALUE']
   */


        driver.get("https://rediff.com");
        //driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a[title*='Sign in")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("abcdefgh");
        driver.findElement(By.cssSelector("input#password")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[contains(@name,'procee')]")).click();










    }//end of main method
}//end of class
