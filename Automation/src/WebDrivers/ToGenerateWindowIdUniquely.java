package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateWindowIdUniquely {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedrivers.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String winIDForGoogle =driver.getWindowHandle();
		
		System.out.println("ID for Google : "+winIDForGoogle);
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		
		String winIDForfb = driver1.getWindowHandle();
		System.out.println("ID for FB : "+winIDForfb);
	}

}
