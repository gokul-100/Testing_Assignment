package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver ;
	
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By btn_login = By.id("login-button");
	By lbl_logo = By.xpath("//div[@class='app_logo']");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}



	public void enterUserName(String username) {
	
		driver.findElement(txt_username).sendKeys(username);
		
	}



	public void enterPassword(String password) {
		// TODO Auto-generated method stub
		driver.findElement(txt_password).sendKeys(password);
	}



	public void hitLoginButton() {
		// TODO Auto-generated method stub
		driver.findElement(btn_login).click();
	}



	public void isAppLoginDisplayed() {
		// TODO Auto-generated method stub
		driver.findElement(lbl_logo).isDisplayed();
	}



	public void UserLogin(String name, String pasword) {
		driver.findElement(txt_username).sendKeys(name);
		driver.findElement(txt_password).sendKeys(pasword);
		driver.findElement(btn_login).click();
		
	}
	
}
