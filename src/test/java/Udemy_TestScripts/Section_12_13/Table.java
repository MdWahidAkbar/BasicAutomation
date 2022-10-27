package Udemy_TestScripts.Section_12_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//Resource//chromedriver83.exe");
        WebDriver driver = new ChromeDriver();


        int sum = 0;


        //Navigating to cricbuzz website and maximize the windows
        driver.navigate().to("https://www.cricbuzz.com/live-cricket-scorecard/29054/eng-vs-wi-2nd-test-west-indies-tour-of-england-2020");
        driver.manage().window().maximize();

        //selecting the first table first because the attribute and value of run has huge number
        WebElement table1 = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int count = table1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();


        /*
        //this is my way.I directly went to the run and got all the runs.
        int count = table1.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).size();
        for (int i =1; i<counts-2; i++) {
        System.out.println(table1.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).get(i).getText());
        }//enf of for loop
        //as extras and total has different class name so We have to take them different way
        System.out.println(driver.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText());
        System.out.println(driver.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold text-black text-right']")).getText());

        */


        for (int i =0; i<count-2; i++) {
            //here -2 means to delete the last two line as they are not our concern

            //System.out.println(table1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
            //Converting the sum into integer
            String value = table1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            int runs = Integer.parseInt(value);
            sum = sum+runs;//each time the run will be iterate and added to run and again iterate till full amount is added

        }//end of for loop
        //System.out.println(sum);//printing total runs without extras

        //as extras has different class name so We have to take them different way
        //here i used travers by sibling system to locate because parent is same to all so I had to use sibling system
        String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int extraRuns = Integer.parseInt(extras);

        //adding the total individual runs with extra runs
        int totalRuns = sum+extraRuns;
        System.out.println("printing total runs with extras by automation :"+totalRuns);


        //I used sibling system to locate
        //System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
        //i am using string to make it integer to compare with total runs with actual
        String actualRunsValues = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        System.out.println("Printing actual total runs from system :"+actualRunsValues);
        //converting to int to compare
        int actualRuns = Integer.parseInt(actualRunsValues);

        if (totalRuns==actualRuns){
            System.out.println("The total runs are same so test passed. The total runs are :"+totalRuns);
        }else {
            System.out.println("The result does not match so test is failed. The actual runs are :"+actualRuns);
        }//end of if else method





    }//end of main method

}//end of java class
