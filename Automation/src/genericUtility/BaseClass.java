package genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Pomrepo.HomePage;
import Pomrepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();
	public ExcelUtility eUtils = new ExcelUtility();

	@BeforeSuite
	public void bsConfig() {
		System.out.println("Data base connection has been established");
	}
	@BeforeClass
	public void bcConfig() throws IOException {
		
		String url =fUtils.fetchDataFromPropertyFile("url");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Timeouts time = driver.manage().timeouts();
	    time.implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get(url);
		System.out.println("Browser has been launched");
		System.out.println("Navigated to the Url");
	}
	@BeforeMethod
	public void bmConfig() throws IOException {
		String username =fUtils.fetchDataFromPropertyFile ("usernme");
		String password = fUtils.fetchDataFromPropertyFile("password");
		 
	    LoginPage login=new LoginPage(driver);
	    login.loginAction(username, password);
		System.out.println("Logged in to the application");
		}
	@AfterMethod
	public void amConfig() {
		 HomePage home =new HomePage(driver);
		 home.logoutAction();
		 System.out.println("Logged out from application");
	}
	
	@AfterClass
	public void acConfig() {
		  driver.quit();    
		  System.out.println("Browser has been closed");
	}
	@AfterSuite
	public void asConfig() {
		  System.out.println("Data base connection has been closed");
	}	
}
