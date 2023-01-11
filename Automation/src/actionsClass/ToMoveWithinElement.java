package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveWithinElement {
       // HOW TO GIVE STAR RATING IN AMP.DEB EXAMPLE BY USING MOUSE HOVERING
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Timeouts time = driver.manage().timeouts();
	    time.implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://amp.dev/documentation/examples/interactivity-dynamic-content/star_rating/");
        WebElement rating1 =  driver.findElement(By.id("rating1"));
		   Actions action =new Actions(driver);
		   action.moveToElement(rating1, 100 , 0).perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  }

}
