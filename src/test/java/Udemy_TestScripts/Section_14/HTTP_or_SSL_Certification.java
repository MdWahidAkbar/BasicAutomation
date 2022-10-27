package Udemy_TestScripts.Section_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTP_or_SSL_Certification {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src//Resource//chromedriver83.exe");


        //SSL Certificates
        //it is because sometime we get popup 'proceed anyway' or 'advance' before browsing into website.
        //by the below way we can accept insecured certifications

        //desired capabilities = option to customize my chrome browser

        DesiredCapabilities ch = DesiredCapabilities.chrome();

        //ch.acceptInsecureCerts(); //this object 'ch' has knowledge about insecured certifications.

        //other optionsto do this
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);


        //this belong to my local browser
        ChromeOptions options = new ChromeOptions();
        options.merge(ch);//to add capabilities

        WebDriver driver = new ChromeDriver(options);





    }//end of main method

}//end of java class
