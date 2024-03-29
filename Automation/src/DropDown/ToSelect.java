package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Timeouts time = driver.manage().timeouts();
	    time.implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/select-menu");
	    
	    WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
	    Select s=new Select(dropdown);
	    s.selectByIndex(0);
	    Thread.sleep(2000);
	    s.selectByVisibleText("Black");
	    Thread.sleep(2000);
	    s.selectByValue("6");
	    

	
	}

}
