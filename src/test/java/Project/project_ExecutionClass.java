package Project;

import com.relevantcodes.extentreports.LogStatus;
import gherkin.lexer.Th;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class project_ExecutionClass extends project_AbstractClass{


    //readable workbook
    Workbook readableFile;
    //readable sheet
    Sheet readableSheet;
    //writable workbook
    WritableWorkbook writableFile;
    //writable sheet
    WritableSheet wSheet;
    //initiate row count
    int row;

    @Test
    public void project() throws InterruptedException, BiffException, IOException, WriteException {

        //define the path of readable file
        readableFile = Workbook.getWorkbook(new File("src//main//java//Excels//Project_ebay.xls"));
        //define readable sheet
        readableSheet = readableFile.getSheet(0);
        //define the path to create writable file
        writableFile = Workbook.createWorkbook(new File("src//main//java//Excels//Project_ebay_Result.xls"),readableFile);
        //define the writable sheet
        wSheet = writableFile.getSheet(0);
        //get all visible row count
        row = wSheet.getRows();

        logger.log(LogStatus.INFO, "Navigate to ebay home page");
        //Navigate to google.com
        driver.navigate().to("https://www.sandbox.ebay.com");

        Thread.sleep(1000);
        logger.log(LogStatus.INFO, "Getting the search box and typing the laptop in the search box");
        project_ReuseableClass.userKeys(driver,"//*[@id='gh-ac']","makeup","Send Keys",logger);
        Thread.sleep(1000);

        logger.log(LogStatus.INFO,"Clicking on the search button");
        project_ReuseableClass.click(driver,"//*[@id='gh-btn']","Search button",logger);

        logger.log(LogStatus.INFO,"Clicking on the Advance search button for more items to be shown");
        project_ReuseableClass.click(driver,"//*[@title='Advanced Search']","Advance Search",logger);
        Thread.sleep(1000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        logger.log(LogStatus.INFO,"Scrolling to the bottom of Search Result Page");
        jse.executeScript("scroll(0,10000);");
        Thread.sleep(1000);

        logger.log(LogStatus.INFO,"Clicking on the result per page button");
        project_ReuseableClass.dropdownBy(driver,"//*[@id='LH_IPP']","200","drop down",logger);
        Thread.sleep(1000);

        logger.log(LogStatus.INFO,"Clicking on the Advance search button for more items to be shown");
        project_ReuseableClass.click(driver,"//*[@id='searchBtnLowerLnk']","Search button",logger);

        logger.log(LogStatus.INFO,"Scrolling to the bottom of Search Result Page");
        jse.executeScript("scroll(0,100000);");

        /*
        Iterating from page 1 to page 10 because once I went to page 30, it shows no result unless i go backward and
          forward again. For the time being I am making page 10 as the last page.
         */

        WebDriverWait wait = new WebDriverWait(driver,20);
        for (int i=1;i<10;i++){
            jse.executeScript("scroll(0,10000);");
            Thread.sleep(1000);
            //Clicking on the arrow button for navigating next page
            project_ReuseableClass.click(driver,"//*[@class='gspr next']","next arrow",logger);

            if (i==9){
                List<WebElement> itemList = new ArrayList<>(wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='lvtitle']"))));
                itemList.get(itemList.size()-1).click();
                Thread.sleep(3000);
                String price = project_ReuseableClass.captureText(driver,"//*[@itemprop='price']","Getting the price,",logger);
                System.out.println("The product price is :"+price);
                String[] onlyPrice = price.split(" ");
                System.out.println("The only price is :"+onlyPrice[1]);
                String[] actualPrice = onlyPrice[1].split("/");
                System.out.println("The actual price is : "+actualPrice[0]);

                String realPrice = (actualPrice[0]);


/*
                SoftAssert sAssert = new SoftAssert();
                sAssert.assertEquals(realPrice,"$10.00");
                if (realPrice=="$10.00"){
                    System.out.println("The prices matches the given price :"+realPrice);
                    logger.log(LogStatus.PASS,"Price matches");
                }else {
                    System.out.println("The price does not match the given price. Actual price is :"+realPrice);
                    logger.log(LogStatus.FAIL,"Price doesn't match. Actual price is " + realPrice);
                }
                sAssert.assertAll();
                }
  */


                if (realPrice.equals("$10.00")){
                    logger.log(LogStatus.PASS,"Price matches");
                } else {
                    logger.log(LogStatus.FAIL,"Price doesn't match. Actual price is " + realPrice);
                }//end of else condition

            }//end of if condition


        }// end of for loop


        String condition = project_ReuseableClass.captureText(driver,"//*[@itemprop='itemCondition']","Item Condition",logger);
        Label label1 = new Label(0,1,condition);
        System.out.println("The Item condition is : "+condition);
        logger.log(LogStatus.INFO,"The Item condition is : "+condition);

        String shipping = project_ReuseableClass.captureText(driver,"//*[@class='sh_gr_bld_new' or @class='notranslate sh-fr-cst 'or @class='notranslate sh-cst ']","Shipping",logger);
        Label label2 = new Label(1,1,shipping);
        System.out.println("The Item condition is : "+shipping);
        logger.log(LogStatus.INFO,"The shipping condition is : "+shipping);

        String location = project_ReuseableClass.captureText(driver,"//*[@itemprop='availableAtOrFrom']","Item Location",logger);
        Label label3 = new Label(2,1,location);
        System.out.println("The Item location is : "+location);
        logger.log(LogStatus.INFO,"The Item location is : "+location);

        String sellerInfo = project_ReuseableClass.captureText(driver,"//*[@class='mbg-nw']","Seller Info",logger);
        Label label4 = new Label(3,1,sellerInfo);
        System.out.println("The seller info is : "+sellerInfo);
        logger.log(LogStatus.INFO,"The seller info is : "+sellerInfo);
        wSheet.addCell(label1);
        wSheet.addCell(label2);
        wSheet.addCell(label3);
        wSheet.addCell(label4);


        writableFile.write();
        writableFile.close();
        readableFile.close();

}//end of Main project


}//End of main class
