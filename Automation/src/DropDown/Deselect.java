package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Timeouts time = driver.manage().timeouts();
	    time.implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/select-menu");
	    
	    WebElement dropdown = driver.findElement(null);
	    Select s=new Select(dropdown);
	    s.selectByIndex(3);
	    Thread.sleep(2000);
	    s.selectByVisibleText("Volvo");
	    
	    Thread.sleep(2000);
	    s.selectByValue("saab");
	    Thread.sleep(2000);
	    
	    s.deselectByIndex(1);
	    Thread.sleep(2000);
	    s.deselectByValue("Audi");
	    Thread.sleep(2000);
	    s.deselectByVisibleText("volvo");
	    
	}

}
