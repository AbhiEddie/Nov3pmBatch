package TakeScreenShotAs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class snhjdhcjdbcj {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window();
	    Timeouts time = driver.manage().timeouts();
	    time.implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.google.com/search?q=nykaa&rlz=1C1RXQR_enIN982IN982&oq=nykaa&aqs=chrome..69i57.1329j0j4&sourceid=chrome&ie=UTF-8");
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(100, 0)");
	    
	}

}
