package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Epayment;
@Test(priority=5)
public class tc10_payment {
	WebDriver driver;
	@Given("^user in the payment page$")
	public void user_in_the_payment_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://petstore.octoperf.com/");
	        tc10_payment paymentpage=new tc10_payment();
	         
	}

	@When("^user enters valid payment details$")
	public void user_enters_valid_payment_details() throws Throwable {
		WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
	    driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
	    Thread.sleep(3000);
	   WebElement username=driver.findElement(By.name("username"));
	   WebElement password=driver.findElement(By.name("password"));
	   Thread.sleep(3000);
	    username.sendKeys("deeksha");
	    Thread.sleep(3000);
	    password.sendKeys("deeksha123");
	    WebElement btnLogin = 
	            driver.findElement(By.name("signon"));
	            btnLogin.click();
	            Thread.sleep(3000);
	WebElement	fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		 Thread.sleep(3000);
		WebElement productid = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		productid.click();
		 Thread.sleep(3000);
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
			addtocart.click();
			 Thread.sleep(3000);
		WebElement	quantity = driver.findElement(By.name("EST-1"));
			quantity.sendKeys("2");
			 Thread.sleep(3000);
		WebElement	proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
			   proceedtocheckout.click();
			   Thread.sleep(3000);
			WebElement   cardtype=driver.findElement(By.name("order.cardType"));
   			cardtype. click();	
   		 Thread.sleep(3000);
   			WebElement cardnumber=driver.findElement(By.name("order.creditCard"));
			cardnumber. sendKeys("2314");
			 Thread.sleep(3000);
		WebElement	expirydate=driver.findElement(By.name("order.expiryDate"));
    		expirydate. sendKeys("54");	
    		 Thread.sleep(3000);
    
		WebElement neworder=driver.findElement(By.name("newOrder"));
    	neworder.click();
    	 Thread.sleep(3000);
    	WebElement confirm=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
    	confirm.click();
    	 Thread.sleep(3000);
    WebElement	signout=driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
    	signout.click();
    	 Thread.sleep(3000);
	}

	@Then("^user confirms the order and signs out$")
	public void user_confirms_the_order_and_signs_out() throws Throwable {
		driver.quit();
	}

/*	@When("^user enters invalid payment details$")
	public void user_enters_invalid_payment_details() throws Throwable  {
			WebElement enter = driver.findElement(By.linkText("Enter the Store"));
			enter.click();
		    driver.findElement(By.linkText("Sign In")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
		    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
		   WebElement username=driver.findElement(By.name("username"));
		   WebElement password=driver.findElement(By.name("password"));
		    username.sendKeys("deeksha");
		    Thread.sleep(2000);
		    password.sendKeys("deeksha123");
		    Thread.sleep(2000);
		    WebElement btnLogin = 
		            driver.findElement(By.name("signon"));
		            btnLogin.click();
		            Thread.sleep(2000);
		
		WebElement	fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
			fish.click();
			Thread.sleep(2000);
			WebElement productid = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
			productid.click();
			Thread.sleep(1000);
			WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
				addtocart.click();
				Thread.sleep(1000);
				driver.findElement(By.name("EST-1")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.name("EST-1")).clear();
				 Thread.sleep(2000);
				 WebElement quantity=driver.findElement(By.name("EST-1"));
				 quantity.sendKeys("5");
				 Thread.sleep(1000);
			WebElement	proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
				   proceedtocheckout.click();
				   Thread.sleep(1000);
				   
				   			WebElement   cardtype=driver.findElement(By.name("order.cardType"));
	   			cardtype. click();	
	   			Thread.sleep(1000);
	   			
	   			driver.findElement(By.name("order.creditCard")).click();
	   		 driver.findElement(By.name("order.creditCard")).clear();
			 WebElement cardnumber=driver.findElement(By.name("order.creditCard"));
				cardnumber. sendKeys("5864 2569 4753 2567");
				Thread.sleep(1000);
				
				
				driver.findElement(By.name("order.expiryDate")).click();
				 driver.findElement(By.name("order.expiryDate")).clear();
				 Thread.sleep(2000);
			WebElement	expirydate=driver.findElement(By.name("order.expiryDate"));
	    		expirydate. sendKeys("");	
	    		Thread.sleep(1000);
	    		
	    		
			WebElement neworder=driver.findElement(By.name("newOrder"));
	    	neworder.click();
	    	Thread.sleep(3000);
	    	WebElement confirm=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
	    	confirm.click();
	    	Thread.sleep(5000);
	    WebElement	signout=driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
	    	signout.click();
	    	
	    	driver.quit();
		} 
	@Then("^system throws error message$")
	public void system_throws_error_message() throws Throwable {
		driver.quit();
	}*/
	}

