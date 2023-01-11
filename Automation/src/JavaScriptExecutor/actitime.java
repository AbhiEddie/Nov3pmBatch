package JavaScriptExecutor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {
  public static void main(String[] args) {
	
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Timeouts time = driver.manage().timeouts();
	    time.implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://demo.actitime.com/login.do");
	    WebElement usernameTextField = driver.findElement(By.id("username"));
	     WebElement passwordTextField = driver.findElement(By.name("pwd"));
	   WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));

	    JavascriptExecutor js=(JavascriptExecutor)driver;	
	    js.executeScript("arguments[0].value='trainee'", usernameTextField);
	    js.executeScript("arguments[0].value='trainee'", passwordTextField);
	    js.executeScript("arguments[0].click()", login);	
	  
}
}
