package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Loginsteps {
	
	static WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User is trying to log in");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.saucedemo.com ");
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username , String password ) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	    throw new io.cucumber.java.PendingException();
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("AND");
		driver.findElement(By.id("login-button")).click();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
		Assert.assertTrue(driver.findElements(By.xpath("//input[@class='app_logo']")).size()>0,"user is navigated to the home page");
		
	    throw new io.cucumber.java.PendingException();
	}

	@And("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And2");
		driver.close();
	    throw new io.cucumber.java.PendingException();
	}

//	@Given("I want to write a step with <name>")
//	public void i_want_to_write_a_step_with_name() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("I check for the <value> in step")
//	public void i_check_for_the_value_in_step() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("I verify the <status> in step")
//	public void i_verify_the_status_in_step() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
}

