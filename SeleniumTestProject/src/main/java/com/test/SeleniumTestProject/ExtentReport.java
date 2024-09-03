package com.test.SeleniumTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	private static WebDriver driver =null;

	public static void main(String[] args) throws InterruptedException {
		ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter("extent.html");
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test =extent.createTest("Quiz app Tesst1","this is Test validate Google search Functionality");
		
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		
		test.log(Status.INFO,"Starting test case");
		driver =new FirefoxDriver();
		
		driver.get("http://localhost:3000/adminlogin");
		test.pass("Navigated to adminLogin.com");
		
		driver.findElement(By.id("email")).sendKeys("admin2@gmail.com");
		test.pass("entered email in textarea");
		
		driver.findElement(By.id("password")).sendKeys("12345678");
		test.pass("enter the password ");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test.pass("hit on the keyboard enterd key");
		
		test.pass("test completed");
		extent.flush();
		}
}
