package tharshiPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFBLogin {
	
	public WebDriver driver;
	public String driverPath = "C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe";
	
	LoginFB lfb;
	

	@BeforeTest
	public void setUp() {
		
	
	System.setProperty("webdriver.chrome.driver",driverPath );
	driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://www.facebook.com");

	}
	
	
	@Test
	public void loginIntoFB()
	{
		lfb = new LoginFB(driver);
		////lfb.setPassword("jeytharshi@gmail.com");
		//lfb.setPassword("Loges@1234");
		lfb.login("jeytharshi@gmail.com", "Loges@1234");
		System.out.println("PageTitle: " + lfb.getpageTitle());
	}
	
}
