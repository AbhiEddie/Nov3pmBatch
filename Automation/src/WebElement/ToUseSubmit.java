package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSubmit {

	public static void main(String[] args) throws InterruptedException     {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("websubmit")).submit();


	}

}
