package TestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassD {

	@Test
	public void demo1 () {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		new ChromeDriver();
	}

}
