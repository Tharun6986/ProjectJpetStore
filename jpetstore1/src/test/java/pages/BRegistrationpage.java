package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BRegistrationpage {
	WebDriver driver;
	WebElement register,userid,password,repeatpassword,firstname,lastname,email,phone,address1,address2,city,state,zip,country,langauagepreference,favouritecategory, enablemylist,enablemybanner,saveinformation;
	
	public void Register(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void register()
	{
		register=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
		register.click();
	}
	public void username(String s)
	{
		userid=driver.findElement(By.name("username"));
		userid.sendKeys("s");
	}
	public void password()
	{
		password=driver.findElement(By.name("password"));
		password.sendKeys("deeksha123");
	}
	public void repeatpassword()
	{
	repeatpassword=driver.findElement(By.name("repeatedPassword"));
	repeatpassword.sendKeys("deeksha123");
	}
	public void firstname()
	{
	firstname=driver.findElement(By.name("account.firstName"));
	firstname.sendKeys("deeksha");
	}
	public void lastname()
	{
	lastname=driver.findElement(By.name("account.lastName"));
	lastname.sendKeys("kote");
	}
	public void email()
	{
	email=driver.findElement(By.name("account.email"));
	email.sendKeys("deekshakote98@gamil.com");
	}
	public void phone()
	{
	phone=driver.findElement(By.name("account.phone"));
	phone.sendKeys("9887345264");
	}
	public void address1()
	{
	address1=driver.findElement(By.name("account.address1"));
	address1.sendKeys("shiva krupa,nrupatunga 5th main");
	}
	public void address2()
	{
	address2=driver.findElement(By.name("account.address2"));
	address2.sendKeys("shiva krupa,nrupatunga 5th main");
	}
	public void city()
	{
	city=driver.findElement(By.name("account.city"));
	city.sendKeys("tumkur");
	}
	public void state()
	{
	state=driver.findElement(By.name("account.state"));
	state.sendKeys("karnataka");
	}
	public void zip()
	{
	zip=driver.findElement(By.name("account.zip"));
	zip.sendKeys("57210");
	}
	public void country()
	{
	country=driver.findElement(By.name("account.country"));
	country.sendKeys("india");
	}
	public void langauagepreference()
	{
		langauagepreference=driver.findElement(By.name("account.languagePreference"));
		langauagepreference. click();
	              
	}
	public void favouritecategory()
	{
		favouritecategory=driver.findElement(By.name("account.favouriteCategoryId"));
		favouritecategory. click();
	              
	}
	public void enablemylist()
	{
		enablemylist= driver.findElement(By.name("account.listOption"));
		enablemylist.click();
		
	}
	public void enablemybanner()
	{
		enablemybanner= driver.findElement(By.name("account.bannerOption"));
		enablemybanner.click();
}
	public void saveinformation()
	{
		saveinformation= driver.findElement(By.name("newAccount"));
		saveinformation.click();
}
	
}