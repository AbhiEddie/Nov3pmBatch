package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		
		//invalid selector exception
		//this is a unchecked exception of selenium which occers when the syntax of css selector is invalid.
	}

}
