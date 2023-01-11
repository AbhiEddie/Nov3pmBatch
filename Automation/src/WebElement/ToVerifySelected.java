package WebElement;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifySelected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("file:///C:/Users/pc/Desktop/Selenium.html");
	    
	WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	   
	    //checkbox.click();
	    Boolean selected =  checkbox.isSelected();
	    if (selected)
	    {
	    	System.out.println("Pass : The button is selected");
	    }
	    else
	    	System.out.println("Fail : The button is not selected");
       
	}

}
