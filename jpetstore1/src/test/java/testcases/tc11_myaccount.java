package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilites.myaccount;

public class tc11_myaccount {
	 WebDriver driver;
	 WebElement username,password;
	 @Given("^user is in home page$")
	 public void user_is_in_home_page() throws Throwable {
	   
	        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://petstore.octoperf.com/");
	        myaccount enterstore = new myaccount();
	       
	    }
	 @When("^user log in$")
	 public void user_log_in() throws Throwable{
			WebElement enter = driver.findElement(By.linkText("Enter the Store"));
			enter.click();
			driver.findElement(By.linkText("Sign In")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
	        Thread.sleep(3000);
	        username=driver.findElement(By.name("username"));
	        password=driver.findElement(By.name("password"));
	        username.sendKeys("sreekeerthi");
	        Thread.sleep(3000);
	        password.sendKeys("keerthi@511");
	        Thread.sleep(3000);
	        WebElement btnLogin = 
	                driver.findElement(By.name("signon"));
	                btnLogin.click();
	                driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
	                Thread.sleep(3000);
	                driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
	                Thread.sleep(3000);
			
		}
		 
	 @Then("^user views order$")
	 public void user_views_order() throws Throwable  {
				driver.quit();
		
}
}
