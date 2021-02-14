package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Dbuyproduct;

public class tc9_remove {
WebDriver driver;
	
@Given("^user  searches for a other product$")
public void user_searches_for_a_other_product() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/");
        tc9_remove remove=new tc9_remove();
	}

	@When("^user wants to remove an item$")
	public void user_wants_to_remove_an_item() throws Throwable {
		 driver.findElement(By.linkText("Enter the Store")).click();
		    driver.findElement(By.linkText("Sign In")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click(); 
		   driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
		   Thread.sleep(2000);
		   WebElement username=driver.findElement(By.name("username"));
		   WebElement password=driver.findElement(By.name("password"));
		    username.sendKeys("sreekeerthi");
		    Thread.sleep(2000);
		    password.sendKeys("keerthi@511");
		    WebElement btnLogin = 
		            driver.findElement(By.name("signon"));
		            btnLogin.click();
		            Thread.sleep(2000);
		
		WebElement	fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
			fish.click();
			Thread.sleep(2000);
			WebElement productid = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
			productid.click();
			Thread.sleep(2000);
			WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
				addtocart.click();
				Thread.sleep(2000);
			 driver.findElement(By.name("EST-1")).click();
			 driver.findElement(By.name("EST-1")).clear();
			 Thread.sleep(2000);
			 WebElement quantity=driver.findElement(By.name("EST-1"));
			 quantity.sendKeys("2");
				Thread.sleep(2000);
				
				
				WebElement	dogs = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img"));
			       dogs.click();
			       WebElement productid1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
					productid1.click();
					Thread.sleep(2000);
					WebElement addtocart1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
						addtocart1.click();
						Thread.sleep(2000);
					 driver.findElement(By.name("EST-8")).click();
					 driver.findElement(By.name("EST-8")).clear();
					 WebElement quantity1=driver.findElement(By.name("EST-8"));
					 quantity1.sendKeys("26");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[8]/a")).click();
				Thread.sleep(3000);
				
				
				
			WebElement	proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
				   proceedtocheckout.click();
				   

	}

	@Then("^user update the cart$")
	public void user_update_the_cart() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
