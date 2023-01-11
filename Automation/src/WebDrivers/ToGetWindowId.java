package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class ToGetWindowId {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedrivers.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().getSize();
		driver.get("https://www.google.co.in/");
		
		String windowId =driver.getWindowHandle();
		System.out.println(windowId);
	}

}
