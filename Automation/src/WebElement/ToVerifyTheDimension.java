package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheDimension {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("file:///C:/Users/pc/Desktop/Selenium.html");
	    
	    Dimension usernameDim  = driver.findElement(By.id("123")).getSize();
           System.out.println(usernameDim);
           
         int usernameHeight = usernameDim.getHeight();
         int usernameWidth = usernameDim.getWidth();
           
        Dimension passwordDim  = driver.findElement(By.id("456")).getSize();
        int passwordHeight = passwordDim.getHeight();
        int passwordWidth = passwordDim.getWidth();
        
        if(usernameHeight==passwordHeight && usernameWidth== passwordWidth)
        {
        	
    	    	System.out.println("Pass : The dimension is verified");
    	    }
    	    else
    	    	System.out.println("Fail : The dimension is not verified");}
        
        
}



