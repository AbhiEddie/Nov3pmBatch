package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

	 driver.get("https://www.google.co.in/");
	 driver.findElement(By.name("q")).sendKeys("elon");
	 Thread.sleep(5000);
	 List<WebElement> autosuggestions=driver.findElements(By.xpath("//span[contains(text(),'lon')]"));
     System.out.println(autosuggestions);
     int noOfAutoSuggestions = autosuggestions.size();
     System.out.println("Number Of Auto Suggestion : "+noOfAutoSuggestions);
     for(WebElement suggestion:autosuggestions) {
    	 System.out.println(suggestion.getText());
     }
     
     
     
	}

}
