package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyYAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("file:///C:/Users/pc/Desktop/Selenium.html");
	    Point usernameLoc = driver.findElement(By.id("123")).getLocation();
	    System.out.println(usernameLoc);
	    int usernameStartY = usernameLoc.getY();
	    Point passwordLoc = driver.findElement(By.id("456")).getLocation();
	      
	    int passwordStartY = passwordLoc.getY();
	    
	    System.out.println("The start X of Username is: "+usernameStartY);
	    System.out.println("The start Y of Username is: "+passwordStartY);
	    
	    if(usernameStartY==passwordStartY )
	    {
	    	System.out.println("Pass: The allignment is Verified");
	    }
	    else
	    	System.out.println("Fail: The allignment is not Verified");

	}

}
