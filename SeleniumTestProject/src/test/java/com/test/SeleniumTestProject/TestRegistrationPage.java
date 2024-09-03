package com.test.SeleniumTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestRegistrationPage {
	@Test
	public void TestRegistraion() throws InterruptedException {
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://localhost:3000/adminlogin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("admin2@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
