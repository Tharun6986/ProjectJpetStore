package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Cloginpage;
import pages.Cloginpage;
public class tc3_loginpage {
	WebDriver driver;
	 WebElement enterstore, signin,username,password,login;
	@Given("^user in the login page$")
	public void user_in_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 
		   
		    driver=new ChromeDriver();
		    driver.get("https://petstore.octoperf.com/");
		    
		    
		    tc3_loginpage loginpages = new tc3_loginpage();
	        
	                 
	}

	@When("^user wants to login with valid credentials$")
	public void user_wants_to_login_with_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 
		driver.findElement(By.linkText("Enter the Store")).click();
	    driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
	    username=driver.findElement(By.name("username"));
	    password=driver.findElement(By.name("password"));
	    Thread.sleep(5000);
	    username.sendKeys("deeksha");
	    Thread.sleep(5000);
	    password.sendKeys("deeksha123");
	    Thread.sleep(5000);
	    WebElement btnLogin = 
	            driver.findElement(By.name("signon"));
	            btnLogin.click();
	          WebElement signout=  driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
	          signout.click();
	    Thread.sleep(5000);  
	}
	

	@Then("^user logs in$")
	public void user_logs_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^User login with invalid username$")
	public void user_login_with_invalid_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Enter the Store")).click();
	    driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
	    username=driver.findElement(By.name("username"));
	    password=driver.findElement(By.name("password"));
	    Thread.sleep(5000);
	    username.sendKeys("deekshasingh");
	    Thread.sleep(5000);
	    password.sendKeys("deeksha123");
	    Thread.sleep(5000);
	    WebElement btnLogin = 
	            driver.findElement(By.name("signon"));
	            btnLogin.click();
	         
	    Thread.sleep(5000);  
	}

	@Then("^system throws an errorso message$")
	public void system_throws_an_errorso_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.quit(); 
	}

	@When("^User login with invalid password$")
	public void user_login_with_invalid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Enter the Store")).click();
	    driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
	    username=driver.findElement(By.name("username"));
	    password=driver.findElement(By.name("password"));
	    Thread.sleep(5000);
	    username.sendKeys("deeksha");
	    Thread.sleep(5000);
	    password.sendKeys("deeksha123singh");
	    Thread.sleep(5000);
	    WebElement btnLogin = 
	            driver.findElement(By.name("signon"));
	            btnLogin.click();
	         
	    Thread.sleep(5000);  
	}

	@Then("^system throws an errorthere message$")
	public void system_throws_an_errorthere_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.quit();
	}

	@When("^User login with empty fields$")
	public void user_login_with_empty_fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Enter the Store")).click();
	    driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
	    username=driver.findElement(By.name("username"));
	    password=driver.findElement(By.name("password"));
	    Thread.sleep(5000);
	    username.sendKeys(" ");
	    Thread.sleep(5000);
	    password.sendKeys(" ");
	    Thread.sleep(5000);
	    WebElement btnLogin = 
	            driver.findElement(By.name("signon"));
	            btnLogin.click();
	         
	    Thread.sleep(5000);  
	}

	@Then("^system throws an errorhere message$")
	public void system_throws_an_errorhere_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}