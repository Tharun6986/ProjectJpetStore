package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tc8_buybirds {
WebDriver driver;
	
@Given("^Click on birds$")
public void click_on_birds() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/");
        tc8_buybirds Dbuyproduct=new tc8_buybirds();
	}

@When("^User wants to buy a bird$")
public void user_wants_to_buy_a_bird() throws Throwable {
		 driver.findElement(By.linkText("Enter the Store")).click();
		    driver.findElement(By.linkText("Sign In")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click(); 
		   driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
		   Thread.sleep(2000);
		   WebElement username=driver.findElement(By.name("username"));
		   WebElement password=driver.findElement(By.name("password"));
		    username.sendKeys("deeksha");
		    Thread.sleep(2000);
		    password.sendKeys("deeksha123");
		    WebElement btnLogin = 
		            driver.findElement(By.name("signon"));
		            btnLogin.click();
		            Thread.sleep(2000);
		
		WebElement	birds = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[5]/img"));
	     birds.click();
			Thread.sleep(2000);
	WebElement productid = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
			productid.click();
			Thread.sleep(2000);
			WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
				addtocart.click();
				Thread.sleep(2000);
			 driver.findElement(By.name("EST-18")).click();
			 driver.findElement(By.name("EST-18")).clear();
			 WebElement quantity=driver.findElement(By.name("EST-18"));
			 quantity.sendKeys("7");
				Thread.sleep(2000);
			WebElement	proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
				   proceedtocheckout.click();
	}

@Then("^User buys bird and adds to cart$")
public void user_buys_bird_and_adds_to_cart() throws Throwable  {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
