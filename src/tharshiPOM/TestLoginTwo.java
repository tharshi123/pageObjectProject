//package tharshiPOM;
package tharshiPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
//import TestLoginTwo.java;


public class TestLoginTwo {
	
	public WebDriver driver;
	public String driverPath = "C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe";
	
	LoginPage lfb;
	

	@BeforeTest
	public void setUp() {
		
	
	System.setProperty("webdriver.chrome.driver",driverPath );
	driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://www.facebook.com");

	}
	
	@Parameters({ "username", "password" })
	@Test
	public void loginIntoFB(String username , String password)
	{
		System.out.println("Iam inside login kkkkkpage"); 
		lfb = new LoginPage(driver);
		lfb.login(username, password);
		System.out.println("PageTitle: " + lfb.getpageTitle());
	}
	
}
