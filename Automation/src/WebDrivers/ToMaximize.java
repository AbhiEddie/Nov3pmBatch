package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximize {

	public static void main(String[] args) {
	 
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome.exe");
	    WebDriver driver=new ChromeDriver();
	    org.openqa.selenium.WebDriver.Options man = driver.manage();
	    Window win = man.window();
	    win.maximize();
	    
	
	
	
	
	
	
	}

}
