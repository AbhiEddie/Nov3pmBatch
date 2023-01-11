package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class ToClear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("file:///C:/Users/pc/Desktop/demoXpath.html");

	    WebElement aTextField = driver.findElement(By.xpath("//input[@value='A']"));
	    aTextField.clear();
	    Thread.sleep(2000);
	    aTextField.sendKeys("Abhi");
	    }

}
