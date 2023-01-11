package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindTheTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("file:///C:/Users/pc/Desktop/Selenium.html"); 
	           String usernameTagName = driver.findElement(By.id("123")).getTagName();
	           System.out.println(usernameTagName);

	}

}
