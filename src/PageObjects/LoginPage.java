//package .com.tharshi123.pageObjectProject.src.PageObjects;
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  
	WebDriver driver;
	By userNameEle = By.id("email");
	By passwordEle = By.id("pass");
	By loginButton =By.id("loginbutton");
	
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void setUsername(String username) {
		driver.findElement(userNameEle).sendKeys(username);
	}
	
	public void setPassword (String password) {
		driver.findElement(passwordEle).sendKeys(password);
	}
	
	public void login(String username, String password)
	{
		
		this.setUsername(username);
		this.setPassword(password);
		driver.findElement(loginButton).click();
	}
	
	public String getpageTitle() {
		return driver.getTitle();
		
	}
	
}
