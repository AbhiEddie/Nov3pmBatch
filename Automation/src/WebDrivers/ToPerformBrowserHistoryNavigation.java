package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
        Navigation nav =driver.navigate();
        nav.to("https://facebook.com/");
        Thread.sleep(2000);
        nav.back();
        Thread.sleep(2000);
        nav.forward();
        Thread.sleep(2000);
        nav.refresh();
        Thread.sleep(2000);
        driver.quit();
}
}
