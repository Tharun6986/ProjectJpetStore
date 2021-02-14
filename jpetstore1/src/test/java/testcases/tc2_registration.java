package testcases;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BRegistrationpage;

public class tc2_registration {
	WebDriver driver;
	
	@Given("^the user is in the registration page$")
	public void the_user_is_in_the_registration_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("https://petstore.octoperf.com/");
	       tc2_registration registrationpage = new tc2_registration();
	}

	@When("^the user wants to register with his credentials$")
	public void the_user_wants_to_register_with_his_credentials() throws Throwable {
		WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		WebElement signin = driver.findElement(By.linkText("Sign In"));
		signin.click();
		Thread.sleep(3000);
		
		WebElement register=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
		register.click();
		Thread.sleep(3000);
		WebElement userid=driver.findElement(By.name("username"));
		userid.sendKeys("deeksha123");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("deeksha@123");
		Thread.sleep(3000);
		WebElement repeatpassword=driver.findElement(By.name("repeatedPassword"));
		repeatpassword.sendKeys("deeksha@123");
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.name("account.firstName"));
		firstname.sendKeys("deekshakote");
		Thread.sleep(3000);
		WebElement lastname=driver.findElement(By.name("account.lastName"));
		lastname.sendKeys("shobha");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.name("account.email"));
		email.sendKeys("deekshakote@gamil.com");
		Thread.sleep(3000);
		WebElement phone=driver.findElement(By.name("account.phone"));
		phone.sendKeys("982391213");
		Thread.sleep(3000);
		WebElement address1=driver.findElement(By.name("account.address1"));
		address1.sendKeys("jayanagar 5th");
		Thread.sleep(3000);
		WebElement address2=driver.findElement(By.name("account.address2"));
		address2.sendKeys("jayanagar 5th main");
		Thread.sleep(3000);
		WebElement city=driver.findElement(By.name("account.city"));
		city.sendKeys("banglore");
		Thread.sleep(3000);
		WebElement state=driver.findElement(By.name("account.state"));
		state.sendKeys("karnataka");
		Thread.sleep(3000);
		WebElement zip=driver.findElement(By.name("account.zip"));
		zip.sendKeys("57215");
		Thread.sleep(3000);
		WebElement country=driver.findElement(By.name("account.country"));
		country.sendKeys("india");
		Thread.sleep(3000);
		WebElement langauagepreference=driver.findElement(By.name("account.languagePreference"));
		langauagepreference. click();
		Thread.sleep(3000);
		WebElement favouritecategory=driver.findElement(By.name("account.favouriteCategoryId"));
		favouritecategory. click();
		Thread.sleep(3000);
		WebElement enablemylist= driver.findElement(By.name("account.listOption"));
	    enablemylist.click();
	    Thread.sleep(3000);
	   WebElement enablemybanner= driver.findElement(By.name("account.bannerOption"));
		enablemybanner.click();
		Thread.sleep(3000);
		WebElement saveinformation= driver.findElement(By.name("newAccount"));
		saveinformation.click();
		Thread.sleep(3000);
		
	}

	@Then("^he registers and logs in$")
	public void he_registers_and_logs_in() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
		
	}

	@When("^the user enters invalid repeat password$")
	public void the_user_enters_invalid_repeat_password() throws Throwable {
		WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		WebElement signin = driver.findElement(By.linkText("Sign In"));
		signin.click();
		Thread.sleep(3000);
		
		WebElement register=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
		register.click();
		Thread.sleep(3000);
		WebElement userid=driver.findElement(By.name("username"));
		userid.sendKeys("deeksha123");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("deeksha@123");
		Thread.sleep(3000);
		WebElement repeatpassword=driver.findElement(By.name("repeatedPassword"));
		repeatpassword.sendKeys("deeksha1");
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.name("account.firstName"));
		firstname.sendKeys("deekshakote");
		Thread.sleep(3000);
		WebElement lastname=driver.findElement(By.name("account.lastName"));
		lastname.sendKeys("shobha");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.name("account.email"));
		email.sendKeys("deekshakote@gmail.com.com");
		Thread.sleep(3000);
		WebElement phone=driver.findElement(By.name("account.phone"));
		phone.sendKeys("982391213");
		Thread.sleep(3000);
		WebElement address1=driver.findElement(By.name("account.address1"));
		address1.sendKeys("jayanagar 5th");
		Thread.sleep(3000);
		WebElement address2=driver.findElement(By.name("account.address2"));
		address2.sendKeys("jayanagar 5th");
		Thread.sleep(3000);
		WebElement city=driver.findElement(By.name("account.city"));
		city.sendKeys("banglore");
		Thread.sleep(3000);
		WebElement state=driver.findElement(By.name("account.state"));
		state.sendKeys("karnataka");
		Thread.sleep(3000);
		WebElement zip=driver.findElement(By.name("account.zip"));
		zip.sendKeys("57215");
		Thread.sleep(3000);
		WebElement country=driver.findElement(By.name("account.country"));
		country.sendKeys("india");
		Thread.sleep(3000);
		WebElement langauagepreference=driver.findElement(By.name("account.languagePreference"));
		langauagepreference. click();
		Thread.sleep(3000);
		WebElement favouritecategory=driver.findElement(By.name("account.favouriteCategoryId"));
		favouritecategory. click();
		Thread.sleep(3000);
		WebElement enablemylist= driver.findElement(By.name("account.listOption"));
	    enablemylist.click();
	    Thread.sleep(3000);
	   WebElement enablemybanner= driver.findElement(By.name("account.bannerOption"));
		enablemybanner.click();
		Thread.sleep(3000);
		WebElement saveinformation= driver.findElement(By.name("newAccount"));
		saveinformation.click(); 
		Thread.sleep(10000);
		
		
		
	} 
	@Then("^system throws an error1 message$")
	public void system_throws_an_errorso_message() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
	@When("^the user enters invalid mail id$")
	public void the_user_enters_invalid_mail_id() throws Throwable {
		WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		WebElement signin = driver.findElement(By.linkText("Sign In"));
		signin.click();
		Thread.sleep(3000);
		
		WebElement register=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
		register.click();
		Thread.sleep(3000);
		WebElement userid=driver.findElement(By.name("username"));
		userid.sendKeys("deeksha123");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("deeksha@123");
		Thread.sleep(3000);
		WebElement repeatpassword=driver.findElement(By.name("repeatedPassword"));
		repeatpassword.sendKeys("deeksha@123");
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.name("account.firstName"));
		firstname.sendKeys("deekshakote");
		Thread.sleep(3000);
		WebElement lastname=driver.findElement(By.name("account.lastName"));
		lastname.sendKeys("shobha");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.name("account.email"));
		email.sendKeys("deekshakote");
		Thread.sleep(3000);
		WebElement phone=driver.findElement(By.name("account.phone"));
		phone.sendKeys("982391213");
		Thread.sleep(3000);
		WebElement address1=driver.findElement(By.name("account.address1"));
		address1.sendKeys("jayanagar 5th");
		Thread.sleep(3000);
		WebElement address2=driver.findElement(By.name("account.address2"));
		address2.sendKeys("jayanagar 5th");
		Thread.sleep(3000);
		WebElement city=driver.findElement(By.name("account.city"));
		city.sendKeys("banglore");
		Thread.sleep(3000);
		WebElement state=driver.findElement(By.name("account.state"));
		state.sendKeys("karnataka");
		Thread.sleep(3000);
		WebElement zip=driver.findElement(By.name("account.zip"));
		zip.sendKeys("57215");
		Thread.sleep(3000);
		WebElement country=driver.findElement(By.name("account.country"));
		country.sendKeys("india");
		Thread.sleep(3000);
		WebElement langauagepreference=driver.findElement(By.name("account.languagePreference"));
		langauagepreference. click();
		Thread.sleep(3000);
		WebElement favouritecategory=driver.findElement(By.name("account.favouriteCategoryId"));
		favouritecategory. click();
		Thread.sleep(3000);
		WebElement enablemylist= driver.findElement(By.name("account.listOption"));
	    enablemylist.click();
	    Thread.sleep(3000);
	   WebElement enablemybanner= driver.findElement(By.name("account.bannerOption"));
		enablemybanner.click();
		Thread.sleep(3000);
		WebElement saveinformation= driver.findElement(By.name("newAccount"));
		saveinformation.click(); 
		Thread.sleep(10000);
	}
	@Then("^system throws an error2 message$")
	public void system_throws_an_errorthere_message() throws Throwable {
		Thread.sleep(3000);
		driver.quit();  
	}
	@When("^the user enters invalid address$")
	public void the_user_enters_invalid_address() throws Throwable {
		WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		WebElement signin = driver.findElement(By.linkText("Sign In"));
		signin.click();
		Thread.sleep(3000);
		
		WebElement register=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
		register.click();
		Thread.sleep(3000);
		WebElement userid=driver.findElement(By.name("username"));
		userid.sendKeys("deeksha123");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("deeksha@123");
		Thread.sleep(3000);
		WebElement repeatpassword=driver.findElement(By.name("repeatedPassword"));
		repeatpassword.sendKeys("deeksha@123");
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.name("account.firstName"));
		firstname.sendKeys("deekshakote");
		Thread.sleep(3000);
		WebElement lastname=driver.findElement(By.name("account.lastName"));
		lastname.sendKeys("shobha");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.name("account.email"));
		email.sendKeys("deekshakote@gamil.com");
		Thread.sleep(3000);
		WebElement phone=driver.findElement(By.name("account.phone"));
		phone.sendKeys("982391213");
		Thread.sleep(3000);
		WebElement address1=driver.findElement(By.name("account.address1"));
		address1.sendKeys("123");
		Thread.sleep(3000);
		WebElement address2=driver.findElement(By.name("account.address2"));
		address2.sendKeys("123");
		Thread.sleep(3000);
		WebElement city=driver.findElement(By.name("account.city"));
		city.sendKeys("banglore");
		Thread.sleep(3000);
		WebElement state=driver.findElement(By.name("account.state"));
		state.sendKeys("karnataka");
		Thread.sleep(3000);
		WebElement zip=driver.findElement(By.name("account.zip"));
		zip.sendKeys("57215");
		Thread.sleep(3000);
		WebElement country=driver.findElement(By.name("account.country"));
		country.sendKeys("india");
		Thread.sleep(3000);
		WebElement langauagepreference=driver.findElement(By.name("account.languagePreference"));
		langauagepreference. click();
		Thread.sleep(3000);
		WebElement favouritecategory=driver.findElement(By.name("account.favouriteCategoryId"));
		favouritecategory. click();
		Thread.sleep(3000);
		WebElement enablemylist= driver.findElement(By.name("account.listOption"));
	    enablemylist.click();
	    Thread.sleep(3000);
	   WebElement enablemybanner= driver.findElement(By.name("account.bannerOption"));
		enablemybanner.click();
		Thread.sleep(3000);
		WebElement saveinformation= driver.findElement(By.name("newAccount"));
		saveinformation.click(); 
		Thread.sleep(10000); 
	}
	@Then("^system throws an error3 message$")
	public void system_throws_an_errorhere_message() throws Throwable {
		Thread.sleep(3000);
		driver.quit();    
	}
	}

