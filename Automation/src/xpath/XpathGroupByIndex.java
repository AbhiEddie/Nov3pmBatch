package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGroupByIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/s?k=oneplus+10+r+5g&crid=17YS5Y5I3HSB7&sprefix=oneplus+10+r+5g%2Caps%2C450&ref=nb_sb_noss_1");
        //(//TagName[attribute OR Text any of this ])[] 
	    WebElement price = driver.findElement(By.xpath("(//div[text()='₹65,999'])[1]"));   
	    String actualPrice=price.getText();
	    System.out.println(actualPrice);

	}

}
