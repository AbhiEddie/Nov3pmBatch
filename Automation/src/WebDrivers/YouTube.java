package WebDrivers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window();
		driver.get("https://www.flipkart.com/");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.linkText("Terms of Use")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		Thread.sleep(7000);
	
		for(String id:allWindowIds) {
			driver.switchTo().window(id); 
			if(id.equals(parentWindowId)) {
			Thread.sleep(7000);
			driver.findElement(By.linkText("POLICY")).click();
		
			break;
		
		
			}
		}
	}

}
