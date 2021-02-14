package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Dbuyproduct;

public class tc5_buydogs {
WebDriver driver;
	
@Given("^Click on dogs$")
public void click_on_dogs() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/");
        tc5_buydogs buydogspage=new tc5_buydogs();
	}

@When("^User wants to buy a dog$")
public void user_wants_to_buy_a_dog() throws Throwable {
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
		
		WebElement	dogs = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]/img"));
	       dogs.click();
			Thread.sleep(2000);
			WebElement productid = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
			productid.click();
			Thread.sleep(2000);
			WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
				addtocart.click();
				Thread.sleep(2000);
			 driver.findElement(By.name("EST-6")).click();
			 driver.findElement(By.name("EST-6")).clear();
			 WebElement quantity=driver.findElement(By.name("EST-6"));
			 quantity.sendKeys("26");
				Thread.sleep(2000);
			WebElement	proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
				   proceedtocheckout.click();
	}

@Then("^User buys dogs and adds to cart$")
public void user_buys_dogs_and_adds_to_cart() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}
