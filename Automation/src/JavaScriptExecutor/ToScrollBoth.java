package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollBoth {

	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	    driver.get("https://www.flipkart.com/search?q=ipone12&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
	    driver.manage().window().setSize(new Dimension(200,500));
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(100, 500)");
	    
	    //To Refresh
	    js.executeScript("history.go(0)");
	    // To Get Title
	    String title = js.executeAsyncScript("return document.title").toString();
	    System.out.println(title);
	}

}
