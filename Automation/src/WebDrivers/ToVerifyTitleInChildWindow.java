package WebDrivers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitleInChildWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window()/*.maximize()*/;
		driver.get("https://demo.actitime.com/login.do");
		String parentWindowid = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		Thread.sleep(7000);
		driver.get("https://www.actitime.com/");
		String expectedTitle = "actiTIME - Time Tracking Software";
		
		 
		 String actualTitle =driver.getTitle();
		 System.out.println("The actual title : "+actualTitle);
		 System.out.println("The expected title : "+expectedTitle);
		 
		 if(actualTitle.equals(expectedTitle)) {
			 System.out.println("Pass: The Title has been verified");
		 }
		else
			 System.out.println("Fail: The Title has not been verified"); 
		
		
	
	
	}

}
