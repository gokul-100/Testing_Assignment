package com.test.SeleniumTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		
		driver.findElement(By.id("identifierId")).sendKeys("gokulakanna1006@gmal.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();		
		
		
	}

}
