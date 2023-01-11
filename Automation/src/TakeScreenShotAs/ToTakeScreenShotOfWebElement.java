package TakeScreenShotAs;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.io.Files;

public class ToTakeScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		String sysDatetime =date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(sysDatetime);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Timeouts time = driver.manage().timeouts();
	    time.implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=Cj0KCQiA14WdBhD8ARIsANao07h6rVD6pZaokEiewSzMyxvGSLTYv02rAde_fMoUodmBBuI992dzna0aApBzEALw_wcB");
	   WebElement logo= driver.findElement(By.xpath("//div[@class='myx-header-container']"));
	    
	    
	    File source = logo.getScreenshotAs(OutputType.FILE);
        File destination = new File("./Screenshot/myntralogo"+sysDatetime+".png");
        Files.copy(source, destination);

	}

}
