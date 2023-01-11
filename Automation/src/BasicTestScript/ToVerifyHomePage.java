package BasicTestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pomrepo.HomePage;
import Pomrepo.LoginPage;
import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.WebDriverUtility;
import org.testng.Assert;


public class ToVerifyHomePage extends BaseClass{
	
            @Test
            public void verifyHomePageTest() throws IOException {
            System.out.println();
			
		
			
			String expectedTitle =eUtils.fetchStringDataFromExcelSheet("Sheet1",1,0);
            WebDriverUtility wUtils = new WebDriverUtility();
            wUtils.towaitForTitle(driver,"Enter");
            
            HomePage home =new HomePage(driver);
            String actualTitle = home.verifyHomePageTitle();
            
           
            Assert.assertEquals(actualTitle, expectedTitle);
            System.out.println("Pass: The Title is verified");
            
          
          
	
}
}