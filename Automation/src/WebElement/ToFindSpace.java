package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindSpace {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("file:///C:/Users/pc/Desktop/Selenium.html");
	    Rectangle usernameRect = driver.findElement(By.id("123")).getRect();
	    Rectangle passwordRect = driver.findElement(By.id("456")).getRect();
	    
	    int usernameEndX=usernameRect.getX()+usernameRect.getWidth();
	    int passwordStartX=passwordRect.getX();
	    int space=passwordStartX-usernameEndX;
	    
	    System.out.println("The space between the text fields is: "+space);
	    
	}

}
