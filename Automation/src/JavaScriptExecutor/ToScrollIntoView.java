package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollIntoView {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    Timeouts time = driver.manage().timeouts();
		    time.implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get("https://www.selenium.dev/");
		    
		    WebElement text = driver.findElement(By.xpath("//h2[text(='selenium Level Sponsors']"));
		    
		    JavascriptExecutor js=(JavascriptExecutor)driver;	
		    js.executeScript("arguments[0].scrollIntoView=(true)", text);

	}

}
