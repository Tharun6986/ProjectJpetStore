package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Awelcomepage;

public class tc1_welcomepage {
	WebDriver driver;
	@Given("^the user is in the welcome page$")
	public void the_user_is_in_the_welcome_page() throws Throwable {
	      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://petstore.octoperf.com/");
	        Awelcomepage enterstore = new Awelcomepage(); 
	        
	}

	@When("^the user want to enter the store$")
	public void the_user_want_to_enter_the_store() throws Throwable {
		
		WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		
	}

	@Then("^User enters the store and register$")
	public void user_enters_the_store_and_register() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
		
	}


}
