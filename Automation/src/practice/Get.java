package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;


public class Get {

	public static void main(String[] args) throws InterruptedException {
		String expectedTitle="Google";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
        Thread.sleep(2000);
        Navigation nav=driver.navigate();
        nav.to("https://www.facebook.com/");
        Thread.sleep(2000);
        nav.back();
        Thread.sleep(2000);
        nav.forward();
        Thread.sleep(2000);
        nav.refresh();
        Thread.sleep(2000);
        
		
		
	}

}
