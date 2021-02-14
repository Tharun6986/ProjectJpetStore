package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Dbuyproduct;

public class tc4_buyfish {
	WebDriver driver;
	@Given("^user  searches for a product$")
	public void user_searches_for_a_product() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/");
        tc4_buyfish Dbuyproduct=new tc4_buyfish();
	}

	@When("^user wants to buy a product which is in stock$")
	public void user_wants_to_buy_a_product_which_is_in_stock() throws Throwable {
		 driver.findElement(By.linkText("Enter the Store")).click();
		    driver.findElement(By.linkText("Sign In")).click();
		    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
		    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
		   WebElement username=driver.findElement(By.name("username"));
		   WebElement password=driver.findElement(By.name("password"));
		   Thread.sleep(3000);
		    username.sendKeys("deeksha");
		    Thread.sleep(3000);
		    password.sendKeys("deeksha123");
		    Thread.sleep(3000);
		    WebElement btnLogin = 
		            driver.findElement(By.name("signon"));
		            btnLogin.click();
		
		WebElement	fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
			fish.click();
			Thread.sleep(3000);
			WebElement productid = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
			productid.click();
			Thread.sleep(3000);
			WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
				addtocart.click();
				Thread.sleep(3000);
			 driver.findElement(By.name("EST-1")).click();
			 
			 driver.findElement(By.name("EST-1")).clear();
			 Thread.sleep(3000);
			 WebElement quantity=driver.findElement(By.name("EST-1"));
				quantity.sendKeys("2");
				Thread.sleep(3000);
			WebElement	proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
				   proceedtocheckout.click();
	}

	

	

	@Then("^user buys and adds items to cart$")
	public void user_buys_and_adds_items_to_cart() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}

	

}
