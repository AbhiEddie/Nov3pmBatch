package popUps;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleNotificationPopUp {

	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    Timeouts time = driver.manage().timeouts();
		    time.implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get("https://www.yatra.com/");
		    Robot robot = new Robot();
		    robot.keyPress(KeyEvent.VK_TAB);
		    robot.keyPress(KeyEvent.VK_ENTER);

	}

}
